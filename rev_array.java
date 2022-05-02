1st approach 
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		int n = sc.nextInt();
	
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
		    arr[i]=sc.nextInt();
		    }
		int[] arr1 = new int[n];
	  
	    for(int i=0;i<n;i++){
		   arr1[i]=arr[n-1-i];
		 
		   System.out.print(arr1[i]+" ");
		}
		
		t--;
		  System.out.println();
		}
		
	}
}

time Complexity -> O(n)
Space Complexity -> O(n);

2nd approach 
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
	    
		int n = sc.nextInt();
		int[] arr = new int[n];
	     int start =0;
	     int end =n-1;
	      for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	         }
	         int temp;
	     while(start<end){
	         temp =arr[start];
	         arr[start] =arr[end];
	         arr[end] =temp;
	         start++;
	         end--;
	             
	         }
	         for(int i=0;i<n;i++){
	             System.out.print(arr[i]+" ");
	         }
	          System.out.println();
	     t--;
	     }
	    
		}
time Complexity -> O(n)
Space Complexity -> O(1);
