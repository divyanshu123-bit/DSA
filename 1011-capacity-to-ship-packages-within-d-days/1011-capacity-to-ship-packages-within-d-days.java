class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minimum = 0;
        int maximum = 0;

        for(int i=0; i<weights.length; i++)
        {
            minimum = Math.max(minimum , weights[i]);
            maximum = maximum + weights[i];
        }

        int left = minimum;
        int right = maximum;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            int currweight = 0;
            int requireday = 1;
            for(int i=0; i<weights.length; i++)
            {
                if(currweight + weights[i] <= mid)
                {
                    currweight = currweight + weights[i];
                }
                else
                {
                    requireday++;
                    currweight = weights[i];
                }
            }
            if(requireday <= days)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }
}