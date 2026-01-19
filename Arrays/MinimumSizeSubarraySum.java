class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        if (n == 1) {

            if (nums[0] >= target) {
                return 1;
            } else if (nums[0] < target) {
                return 0;
            }
        }
        boolean found = false;
        int min = n;
        int count = 0;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            sum += nums[j];
            count++;

            if (sum >= target) {
                found = true;

                if (min > count) {
                    min = count;
                }
                count = 0;
                i++;
                j = i - 1;
                sum = 0;
            }
        }

        if (found) {
            return min;
        } else {
            return 0;
        }

    }
}