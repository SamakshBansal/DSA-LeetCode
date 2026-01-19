class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int max = 1;
        int i = 0;
        String sub = "";
        int temp = -1;
        for (int j = 0; j < n; j++) {
            temp = sub.indexOf(s.charAt(j));
            if (temp >= 0) {
                i++;
                j = i - 1;
                sub = "";
            } else {
                sub = sub + s.charAt(j);
                if (max < sub.length()) {
                    max = sub.length();
                }
            }

        }
        return max;
    }
}