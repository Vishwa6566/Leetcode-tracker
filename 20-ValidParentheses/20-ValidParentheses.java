// Last updated: 7/9/2026, 10:42:17 AM
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }
}