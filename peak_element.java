class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	static int findPeak(int[] arr , int low , int high , int n){
	   int  mid = (low + high)/2;
	    // checking if mid is the peak or not and if neighbours exists or not 
	    if((mid==0||arr[mid-1] <= arr[mid])&& (mid==n-1 || arr[mid+1]<=arr[mid])) return mid;
	    // if mid is not a peak elememnt
	    else if(mid >0 && arr[mid-1] > arr[mid] ) return findPeak(arr,low,mid-1,n);
	    else return findPeak(arr, mid+1 ,high,n);
	}
	public int peakElement(int[] arr,int n)
    {
        return findPeak(arr,0,n-1,n);
    }
   
}

