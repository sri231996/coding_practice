class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
        
     
        while(l<=h){
             int mid = (l+h)/2;
              
           if(A[mid]==key) return mid;
          // if left part is sorted
            
            if(A[mid]>A[l]){
                  if(A[l]<=key && key<A[mid]) h = mid-1;
                 else l=mid+1;
     }
        // if right part is sorted
        else {
            if(A[mid]<key && A[h]>=key) l=mid+1;
            else h=mid-1;
        }
        }
        return -1;
        
    }
}


Time Comp - O(logn)
