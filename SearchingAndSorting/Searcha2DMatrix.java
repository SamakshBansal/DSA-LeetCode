class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean ans = false;

        int minR = 0;
        int maxR = m - 1;
        int row = minR;

        while (minR <= maxR) {
            int midR = minR + (maxR - minR) / 2;

            if ((matrix[midR][0] <= target) && (target <= matrix[midR][n - 1])) {
                row = midR;
                break;

            } else if (matrix[midR][0] > target) {
                maxR = midR - 1;
            } else {
                minR = midR + 1;
            }
        }

        int minC = 0;
        int maxC = n - 1;

        while (minC <= maxC) {
            int midC = minC + (maxC - minC) / 2;

            if (matrix[row][midC] == target) {
                ans = true;
                break;
            } else if (matrix[row][midC] > target) {
                maxC = midC - 1;
            } else {
                minC = midC + 1;
            }
        }

        return ans;

    }
}