class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = true;
        String slower = s.toLowerCase();
        String snew = "";
        for (char c : slower.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                snew = snew + c;
            }
        }
        int i = 0;
        int j = snew.length() - 1;

        while (i <= j) {
            if (snew.charAt(i) != snew.charAt(j)) {
                ans = false;
            }
            i++;
            j--;
        }

        return ans;
    }
}