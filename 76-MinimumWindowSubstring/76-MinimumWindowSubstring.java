// Last updated: 8/5/2026, 2:15:08 PM
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] map = new int[128];

        for (char c : t.toCharArray())
            map[c]++;

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            if (map[s.charAt(right)]-- > 0)
                count--;

            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                if (++map[s.charAt(left++)] > 0)
                    count++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}