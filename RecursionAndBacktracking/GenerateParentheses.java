class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(0, 0, "", n, ans);
        return ans;
    }

    public void backtrack(int openU, int closeU, String curr, int n, List<String> ans) {
        if (curr.length() == (n * 2)) {
            ans.add(curr);
            return;
        } else {

            if (openU < n) {
                backtrack(openU + 1, closeU, curr + "(", n, ans);
            }
            if (closeU < openU) {
                backtrack(openU, closeU + 1, curr + ")", n, ans);
            }

        }

    }
}