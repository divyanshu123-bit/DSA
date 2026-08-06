class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++)
        {
            maximum = Math.max(maximum , candies[i]);
        }
        int left = 1;
        int right = maximum;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            long ans = 0;
            for(int i=0; i<candies.length; i++)
            {
                ans = ans + (candies[i] / mid);
            }
            if(ans >= k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return right;
    }
}