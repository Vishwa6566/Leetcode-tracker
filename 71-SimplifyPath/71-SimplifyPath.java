// Last updated: 8/5/2026, 2:15:29 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String dir : path.split("/")) {
            if (dir.equals("") || dir.equals(".")) continue;

            if (dir.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}