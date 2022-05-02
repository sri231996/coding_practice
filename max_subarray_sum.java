brute force solution
Time Complexity -> O(nsquare)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                count = count + nums[j];
                max = Math.max(max, count);
            }
        }
        return max;
    }
}

Optimised - kadane's algo 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int curr_sum=0;
        
       
     
        for(int i=0;i<nums.length;i++){
             curr_sum=nums[i]+curr_sum;
            if(curr_sum>maxsum) {
               
                maxsum= curr_sum;
            }
           if(curr_sum<0) curr_sum=0;
            
            
        }
        return maxsum;
        
    }
}
