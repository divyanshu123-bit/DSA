class Solution {
    public int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] < minimum)
            {
                minimum = nums[i];
            }
        }
        return minimum;
    }
}