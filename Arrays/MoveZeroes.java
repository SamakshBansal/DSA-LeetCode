class Solution {
    public void moveZeroes(int[] nums) {
        int pos = nums.length - 1;
        boolean z = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z = true;
                if (pos > i) {
                    pos = i;
                }
                continue;
            }
            if ((nums[i] != 0) && z) {
                nums[pos] = nums[i];
                nums[i] = 0;
                pos++;
            }
        }

    }
}