class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low) / 2;
        int ans = mid;
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[n - 1]) {
            return n;
        }
        if (target == nums[n - 1]) {
            return n - 1;
        }

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                ans = mid;
                break;

            } else if (target < nums[mid]) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        if (nums[mid] < target) {
            ans = mid + 1;
            return ans;

        } else {
            ans = mid;
            return ans;
        }

    }
}