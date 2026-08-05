// Last updated: 8/5/2026, 1:57:33 PM
class Solution {

    public int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        return Math.max(
                rob(nums, 0, nums.length - 2),
                rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int left, int right) {

        int prev1 = 0;
        int prev2 = 0;

        for (int i = left; i <= right; i++) {

            int temp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}