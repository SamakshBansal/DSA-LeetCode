class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = max(nums[i], sum + nums[i]);
            maxSum = max(maxSum, sum);
        }
        return maxSum;
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}