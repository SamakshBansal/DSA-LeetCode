class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = 1;
        while ((nums[i] + nums[j]) != target) {

            if (j == (nums.length - 1)) {
                i++;
                j = i;
            }
            j++;

        }
        ans[0] = i;
        ans[1] = j;

        return ans;

    }
}