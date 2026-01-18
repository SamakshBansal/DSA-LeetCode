class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxS = 0;
        double sum = 0;
        int a = 0;
        int b = k;
        for (int i = 0; i < k; i++) {
            sum += nums[i];

        }

        maxS = sum;

        while (b < nums.length) {
            sum -= nums[a];
            sum += nums[b];
            if (maxS < sum) {
                maxS = sum;
            }

            a++;
            b++;

        }
        return (maxS / k);
    }
}