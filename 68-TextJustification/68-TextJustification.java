// Last updated: 8/5/2026, 2:15:38 PM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int len = words[i].length();
            int j = i + 1;

            while (j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j++;
            }

            StringBuilder sb = new StringBuilder();
            int gaps = j - i - 1;

            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1)
                        sb.append(" ");
                }

                while (sb.length() < maxWidth)
                    sb.append(" ");
            } else {
                int totalChars = 0;
                for (int k = i; k < j; k++)
                    totalChars += words[k].length();

                int spaces = (maxWidth - totalChars) / gaps;
                int extra = (maxWidth - totalChars) % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) {
                        for (int s = 0; s < spaces; s++)
                            sb.append(" ");
                        if (extra-- > 0)
                            sb.append(" ");
                    }
                }
            }

            res.add(sb.toString());
            i = j;
        }

        return res;
    }
}