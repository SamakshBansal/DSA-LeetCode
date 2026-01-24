class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int product = 1;
        boolean z = false;
        int y = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                if (y == 2) {
                    product = 0;
                }
                z = true;
                y++;

            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                answer[j] = product;
            } else {
                if (z) {
                    answer[j] = 0;
                } else {
                    answer[j] = product / nums[j];
                }
            }

        }
        return answer;

    }
}