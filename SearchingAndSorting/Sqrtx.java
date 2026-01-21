class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int min = 1;
        int max = x / 2;
        int ans = min;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (mid <= x / mid) {
                ans = mid;
                min = mid + 1;

            } else {
                max = mid - 1;

            }

        }

        return ans;

    }
}