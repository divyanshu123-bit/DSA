class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int maxnumber = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            if(arr[i] > maxnumber)
            {
                maxnumber = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}