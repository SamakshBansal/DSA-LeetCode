class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit;
        for (int i = 1; i < prices.length; i++) {
            min = minvalue(min, prices[i]);
            profit = prices[i] - min;
            max = maxvalue(max, profit);
        }
        return max;

    }

    int minvalue(int x, int y) {
        if (x > y) {
            return y;
        } else if (x < y) {
            return x;
        } else {
            return x;
        }
    }

    int maxvalue(int x, int y) {
        if (x < y) {
            return y;
        } else if (x < y) {
            return x;
        } else {
            return x;
        }
    }
}