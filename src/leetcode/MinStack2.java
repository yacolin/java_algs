package leetcode;

import java.util.Stack;

public class MinStack2 {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack2() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);

        if (x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack2 ms2 = new MinStack2();

        ms2.push(1);
        ms2.push(2);
        ms2.push(-1);
        ms2.push(-3);

        System.out.println(ms2.getMin());

        ms2.pop();

        System.out.println(ms2.getMin());
    }
}
