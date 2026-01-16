class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                continue;
            } else {
                miss = i;
                break;

            }
        }
        return miss;

    }
}