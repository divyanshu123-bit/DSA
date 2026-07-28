class Solution {
    public int findPeakElement(int[] nums) {
        int maxnumber = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > maxnumber)
            {
                maxnumber = nums[i];
                ans = i;
            }
        }
        return ans;
    }
}