class Solution {
    public boolean isPossible(long a[], long b[], long n, long k) {
       // Your code goes here
      
       
       
        for(long i=0;i<n;i++){
            if(a[(int)i]+b[(int)i]>=k) return true;
            
        }
        return false;
        
        
        
    }
}
