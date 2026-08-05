// Last updated: 8/5/2026, 1:57:31 PM
class Solution {

    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length(); i++) {

            if (s.startsWith(rev.substring(i)))
                return rev.substring(0, i) + s;
        }

        return "";
    }
}