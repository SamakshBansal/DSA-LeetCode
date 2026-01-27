class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        String[][] coll = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" }, { "j", "k", "l" },
                { "m", "n", "o" }, { "p", "q", "r", "s" }, { "t", "u", "v" }, { "w", "x", "y", "z" } };

        backtrack(0, digits, "", coll, ans);
        return ans;

    }

    public void backtrack(int index, String digits, String curr, String[][] coll, List<String> ans) {
        if (index == digits.length()) {
            ans.add(curr);
        } else {
            char d = digits.charAt(index);
            int mapindex = d - '2';
            String[] letters = coll[mapindex];
            for (int i = 0; i < letters.length; i++) {
                String next = curr + letters[i];
                backtrack(index + 1, digits, next, coll, ans);
            }

        }

    }
}