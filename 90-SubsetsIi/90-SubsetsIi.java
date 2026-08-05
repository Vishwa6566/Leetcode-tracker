// Last updated: 8/5/2026, 2:13:57 PM
import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>());

        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> temp) {

        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1])
                continue;

            temp.add(nums[i]);

            backtrack(nums, i + 1, temp);

            temp.remove(temp.size() - 1);
        }
    }
}