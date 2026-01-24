class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        int tempSum = 0;

        int i = 0;
        int j = 1;
        while (i < n) {
            tempSum += nums[i];
            if (tempSum == k) {
                total++;
            }
            i++;
            if (i == n) {
                i = j;
                j++;
                tempSum = 0;
            }

        }

        return total;

    }
}