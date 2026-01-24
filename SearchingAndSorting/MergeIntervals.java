class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> answer = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        int i = 1;
        int j = 0;

        while (i < n) {

            if (end >= intervals[i][0]) {
                if (end <= intervals[i][1]) {
                    end = intervals[i][1];
                }

            } else {
                int[] temp = { start, end };
                answer.add(temp);
                j++;
                start = intervals[i][0];
                end = intervals[i][1];
            }

            i++;

        }
        int[] temp = { start, end };
        answer.add(temp);

        int[][] ans = answer.stream().toArray(int[][]::new);

        return ans;

    }
}