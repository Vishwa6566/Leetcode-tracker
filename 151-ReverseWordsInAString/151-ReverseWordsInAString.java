// Last updated: 8/5/2026, 2:00:44 PM
class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0)
                sb.append(" ");
        }

        return sb.toString();
    }
}