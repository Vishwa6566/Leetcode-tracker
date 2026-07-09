// Last updated: 7/9/2026, 10:42:39 AM

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int idx = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[idx].append(c);

            if (idx == 0) down = true;
            else if (idx == numRows - 1) down = false;

            idx += down ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows)
            res.append(row);

        return res.toString();
    }
}