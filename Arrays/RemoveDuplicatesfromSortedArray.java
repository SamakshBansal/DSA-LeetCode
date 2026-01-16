class Solution {
    public int removeDuplicates(int[] nums) {
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last == nums[i]) {
                nums[i] = 102;
            } else {
                last = nums[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 102) {
                count++;
            }
        }

        int pos = nums.length - 1;
        boolean z = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 102) {
                z = true;
                if (pos > i) {
                    pos = i;
                }
                continue;
            }
            if ((nums[i] != 102) && z) {
                nums[pos] = nums[i];
                nums[i] = 102;
                pos++;
            }
        }

        return count;

    }
}