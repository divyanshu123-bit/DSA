class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile  = Integer.MIN_VALUE;

        for(int i=0; i<piles.length; i++)
        {
            maxpile  = Math.max(maxpile , piles[i]);
        }

        int left = 1;
        int right = maxpile;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            long totalhour = 0;

            for(int i=0; i<piles.length; i++)
            {
                 totalhour += (piles[i] + mid - 1) / mid;
            }

            if(totalhour <= h)
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