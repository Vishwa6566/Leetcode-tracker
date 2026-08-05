// Last updated: 8/5/2026, 2:14:57 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    void backtrack(int index, int[] nums, List<Integer> list) {

        ans.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(i + 1, nums, list);
            list.remove(list.size() - 1);
        }
    }
}