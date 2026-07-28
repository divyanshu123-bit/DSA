class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = firstoccurrence(nums,target);
        int right = lastoccurrence(nums,target);

        return new int[]{left , right};
    }

    private int firstoccurrence(int nums[] , int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
            {
                ans = mid;
                right = mid - 1;
            }

            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return ans;
    }

    private int lastoccurrence(int nums[] , int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
            {
                ans = mid;
                left = mid + 1;
            }

            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return ans;
    }
}