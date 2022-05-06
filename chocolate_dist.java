class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
       long min_diff = Long.MAX_VALUE;
      Collections.sort(a);
      for(long i=0;i+m-1<n;i++){
**imp          min_diff = Math.min(min_diff,a.get((int)(i+m-1))-a.get((int)(i)));
      }
      return min_diff;
    }
}
**-> note that the argument in a.get() function should be an integer , that's why we explicitly  converted long to int

Time Complexity -> O(n)

