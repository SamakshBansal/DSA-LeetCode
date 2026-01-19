class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans = -1;
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low) / 2;
        if (target == nums[0]) {
            return 0;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                ans = mid;
                break;
            } else if (target < nums[mid]) {
                high = mid - 1;

            } else if (target > nums[mid]) {
                low = mid + 1;

            }
        }
        return ans;

    }
}