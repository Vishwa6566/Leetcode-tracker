// Last updated: 8/5/2026, 2:13:47 PM
import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(String s, int index, List<String> path) {

        if (path.size() == 4) {
            if (index == s.length())
                result.add(String.join(".", path));
            return;
        }

        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length())
                break;

            String part = s.substring(index, index + len);

            if ((part.startsWith("0") && part.length() > 1) ||
                Integer.parseInt(part) > 255)
                continue;

            path.add(part);
            backtrack(s, index + len, path);
            path.remove(path.size() - 1);
        }
    }
}