class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        if (k == 0) {
            return 0;
        }
        int product = 1;
        int i = 0;
        int j = 0;
        while (i < n) {
            product = product * nums[j];

            if (product < k) {
                count++;
                j++;
                if (j == n) {
                    product = 1;
                    i++;
                    j = i;
                }

            } else if (product >= k) {
                product = 1;
                i++;
                j = i;

            }

        }
        return count;

    }
}