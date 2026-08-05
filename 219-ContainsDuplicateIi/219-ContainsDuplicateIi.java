// Last updated: 8/5/2026, 1:57:13 PM
import java.util.*;

class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) &&
                i - map.get(nums[i]) <= k)
                return true;

            map.put(nums[i], i);
        }

        return false;
    }
}