class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        int high = n - 1;
        int low = 0;
        int mid = low + (high - low) / 2;
        int ans = mid;

        if (n == 1) {
            return 0;
        }

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) {
                    ans = mid;
                    break;
                }
            }

            if (mid == (n - 1)) {
                if (nums[mid] > nums[mid - 1]) {
                    ans = mid;
                    break;
                }
            }

            if ((nums[mid] > nums[mid + 1]) && (nums[mid] > nums[mid - 1])) {
                ans = mid;
                break;
            } else if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;

            } else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }

        }
        return ans;

    }
}