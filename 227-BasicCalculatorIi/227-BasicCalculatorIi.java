// Last updated: 8/5/2026, 1:56:42 PM
import java.util.*;

class Solution {

    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (int i = 0; i <= s.length(); i++) {

            char c = (i == s.length()) ? '+' : s.charAt(i);

            if (Character.isDigit(c)) {

                num = num * 10 + (c - '0');

            } else if (c != ' ') {

                if (sign == '+')
                    stack.push(num);

                else if (sign == '-')
                    stack.push(-num);

                else if (sign == '*')
                    stack.push(stack.pop() * num);

                else if (sign == '/')
                    stack.push(stack.pop() / num);

                sign = c;
                num = 0;
            }
        }

        int result = 0;

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }
}