class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int min = nums[0];
        int max = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            int c = nums[i];
            int pmax = max;
            max = Math.max(c, Math.max(c * max, c * min));
            min = Math.min(c, Math.min(c * min, c * pmax));
            result = Math.max(max, result);
        }
        return result;
    }
}