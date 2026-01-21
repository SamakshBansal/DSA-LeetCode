class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int totalw = 0;
        int maxW = 0;

        for (int i = 0; i < n; i++) {
            totalw += weights[i];

            if (maxW < weights[i]) {
                maxW = weights[i];
            }
        }
        int min = maxW;
        int max = totalw;
        int ans = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            int sum = 0;
            int countDay = 1;

            for (int i : weights) {
                if (sum + i <= mid) {
                    sum += i;
                } else {
                    countDay++;
                    sum = i;
                }
            }

            if (countDay <= days) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }

        return ans;

    }
}