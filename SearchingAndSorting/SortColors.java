class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int p = i;

        while ((i <= j) && (p <= j)) {
            int temp = 0;
            if (nums[p] == 2) {
                temp = nums[j];
                nums[j] = nums[p];
                nums[p] = temp;
                j--;
            } else if (nums[p] == 0) {
                temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                i++;
                p++;
            } else {
                p++;
            }

        }

    }
}