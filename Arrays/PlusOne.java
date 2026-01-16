class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] != 9) {
            digits[n - 1]++;
            return digits;
        } else {
            int[] ans = new int[n + 1];

            for (int i = n; i > 0; i--) {
                ans[i] = digits[i - 1];
            }
            int k = 0;
            for (int j = n; j >= 0; j--) {
                if (ans[j] == 9) {
                    ans[j] = 0;
                    k = 1;
                } else {
                    if (k == 1) {
                        ans[j]++;
                        break;
                    }
                }

            }

            if (ans[0] == 0) {
                for (int l = 1; l < ans.length; l++) {
                    digits[l - 1] = ans[l];
                }
                return digits;
            } else {
                return ans;

            }

        }

       
    }
}