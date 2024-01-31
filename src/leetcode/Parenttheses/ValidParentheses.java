package leetcode.Parenttheses;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"()[]{}", "(({{}}))", "(([[]]}"};

        for (String str : strs)
            System.out.printf("%s = %s%n", str, isValid(str));
    }
}
