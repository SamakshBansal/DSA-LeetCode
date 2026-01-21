class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        int min = 1;

        for (int i : piles) {
            if (max < i) {
                max = i;
            }
        }
        int ans = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            long countHour = 0;

            for (int j = 0; j < n; j++) {
                if (piles[j] % mid == 0) {
                    countHour = countHour + (piles[j] / mid);
                } else {
                    countHour = countHour + (piles[j] / mid) + 1;
                }
            }

            if (countHour > h) {
                min = mid + 1;
            } else {
                ans = mid;
                max = mid - 1;
            }

        }
        return ans;

    }
}