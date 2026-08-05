// Last updated: 8/5/2026, 2:01:28 PM
class Solution {

    public int singleNumber(int[] nums) {

        int ans = 0;

        for (int num : nums)
            ans ^= num;

        return ans;
    }
}