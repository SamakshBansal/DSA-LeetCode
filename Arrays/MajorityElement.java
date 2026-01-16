class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxEle = nums[0];
        int max = 1;

        int count = 1;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (max < count) {
                    max = count;
                    maxEle = nums[i];
                }

            } else {
                count = 1;

            }
        }

        return maxEle;

    }
}