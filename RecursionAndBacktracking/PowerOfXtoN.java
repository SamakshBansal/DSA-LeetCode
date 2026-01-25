class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return pow(x, N);

    }

    public double pow(double x, long N) {
        if (N == 0) {
            return 1;
        }

        if (N % 2 == 0) {
            double half = pow(x, N / 2);
            return (half * half);

        } else {
            double half = pow(x, N / 2);
            return (x * half * half);

        }

    }
}