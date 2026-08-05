// Last updated: 8/5/2026, 1:57:20 PM
import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtrack(1, k, n, new ArrayList<>());

        return ans;
    }

    private void backtrack(int start, int k, int target,
                           List<Integer> temp) {

        if (temp.size() == k && target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (temp.size() > k || target < 0)
            return;

        for (int i = start; i <= 9; i++) {

            temp.add(i);
            backtrack(i + 1, k, target - i, temp);
            temp.remove(temp.size() - 1);
        }
    }
}