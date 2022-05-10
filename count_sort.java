class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int n = arr.length();
        int[] count = new int[26];
        char[] output = new char[n];
        
        // storing the count in the count array
        for(int i=0;i<n;i++){
            count[arr.charAt(i)-'a']++;
        }
        // storing the position of each element
        for(int i=1;i<26;i++){
            count[i]=count[i]+ count[i-1];
        }
        // according to count array filling the output string
        for(int i=n-1;i>=0;i--){
            output[--count[arr.charAt(i)-'a']] = arr.charAt(i);
        }
        String str = new String(output);
        return str;
    }
}
