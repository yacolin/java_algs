package leetcode.Parenttheses;

import java.util.Deque;
import java.util.LinkedList;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> deque = new LinkedList<Integer>();
        deque.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                deque.push(i);
            } else {
                deque.pop();

                if (deque.isEmpty()) {
                    deque.push(i);
                } else {
                    maxans = Math.max(maxans, i - deque.peek());
                }
            }
        }

        return maxans;
    }
}
