class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] stat = new boolean[nums.length];
        backtrack(nums, stat, curr, ans);
        return ans;

    }

    public void backtrack(int[] nums, boolean[] stat, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
        } else {

            for (int i = 0; i < nums.length; i++) {

                if (stat[i] == true) {
                    continue;
                } else if ((i > 0) && (nums[i] == nums[i - 1]) && (stat[i - 1] == true)) {
                    continue;
                } else {
                    stat[i] = true;
                    curr.add(nums[i]);
                }

                backtrack(nums, stat, curr, ans);
                curr.remove(curr.size() - 1);
                stat[i] = false;

            }
        }
    }
}