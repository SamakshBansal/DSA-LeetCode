class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans = false;
        long temp = 0;
        for (int i = 0; temp < n; i++) {
            temp = (long) Math.pow(2, i);
            if (temp == n) {
                ans = true;
                break;
            }
        }
        return ans;

    }
}