// Last updated: 8/5/2026, 1:57:16 PM
import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (!set.add(num))
                return true;
        }

        return false;
    }
}