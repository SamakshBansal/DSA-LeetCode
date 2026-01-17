class Solution {
    public int maxArea(int[] height) {
        int maxAmount = 0;
        int amount = 0;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            amount = (j - i) * (Math.min(height[i], height[j]));
            if (maxAmount < amount) {
                maxAmount = amount;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return maxAmount;

    }
}