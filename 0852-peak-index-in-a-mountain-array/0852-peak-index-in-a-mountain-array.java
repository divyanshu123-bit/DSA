class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int maxnumber = Integer.MIN_VALUE;
       int ans = 0;
       for(int i=0; i<arr.length; i++)
       {
           maxnumber = Math.max(maxnumber , arr[i]);
       }
       for(int i=0; i<arr.length; i++)
       {
            if(arr[i] == maxnumber)
            {
                ans = i;
            }
       }
       return ans;
    }
   

}