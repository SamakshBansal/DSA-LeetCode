class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(0, 0, candidates, target, curr, ans);
        return ans;
    }

    public void backtrack(int start, int sum, int[] candidates, int target, List<Integer> curr,
            List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (sum > target)
                    return;
                sum += candidates[i];
                curr.add(candidates[i]);
                backtrack(i, sum, candidates, target, curr, ans);
                curr.remove(curr.size() - 1);
                sum -= candidates[i];

            }

        }

    }
}