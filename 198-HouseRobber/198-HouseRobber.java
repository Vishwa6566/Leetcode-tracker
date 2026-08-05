// Last updated: 8/5/2026, 1:58:46 PM
class Solution {
    public int rob(int[] nums) {

        int prev1 = 0;
        int prev2 = 0;

        for (int num : nums) {

            int temp = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}