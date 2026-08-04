class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        if((long)m*k > bloomDay.length)
        {
            return -1;
        }
        for(int i=0; i<bloomDay.length; i++)
        {
            minimum = Math.min(minimum , bloomDay[i]);
            maximum = Math.max(maximum , bloomDay[i]);

        }
        int left = minimum;
        int right = maximum;

        while(left <= right)
        {
            int mid = left + (right - left)/ 2;
            int flower = 0;
            int bouquet = 0;
            for(int i=0; i<bloomDay.length; i++)
            {
                if(bloomDay[i] <= mid)
                {
                    flower ++;
                    if(flower == k)
                    {
                        bouquet ++;
                        flower = 0;
                    }  
                }
                else
                {
                    flower = 0;
                }
            }
            if(bouquet >= m)
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