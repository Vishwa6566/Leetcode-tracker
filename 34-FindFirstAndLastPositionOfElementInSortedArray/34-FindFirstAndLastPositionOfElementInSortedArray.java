// Last updated: 7/9/2026, 10:41:58 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { find(nums, target, true), find(nums, target, false) };
    }

    private int find(int[] nums, int target, boolean left) {
        int l = 0, r = nums.length - 1;
        int res = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                res = mid;
                if (left) r = mid - 1;
                else l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return res;
    }
}