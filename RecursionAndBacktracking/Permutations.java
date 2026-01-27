class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] stat = new boolean[nums.length];
        backtrack(0, nums, stat, curr, ans);
        return ans;
    }

    public void backtrack(int start, int[] nums, boolean[] stat, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
        }

        for (int i = 0; i < nums.length; i++) {
            if (stat[i] == true) {
                continue;

            } else {
                stat[i] = true;
                curr.add(nums[i]);
            }
            backtrack(i + 1, nums, stat, curr, ans);
            curr.remove(curr.size() - 1);
            stat[i] = false;
        }
    }

}