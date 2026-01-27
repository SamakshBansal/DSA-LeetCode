class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, 0, target, candidates, curr, ans);
        return ans;
    }

    public void backtrack(int start, int sum, int target, int[] candidates, List<Integer> curr,
            List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (sum > target) {
                    break;
                }
                if ((i > start) && (candidates[i] == candidates[i - 1])) {
                    continue;
                }
                sum += candidates[i];
                curr.add(candidates[i]);
                backtrack(i + 1, sum, target, candidates, curr, ans);
                curr.remove(curr.size() - 1);
                sum -= candidates[i];
            }

        }

    }

}