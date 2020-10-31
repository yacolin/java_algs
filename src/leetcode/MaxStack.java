package leetcode;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();

    public MaxStack() {
        maxStack.push(Integer.MIN_VALUE);
    }


    public void push(int x) {
        stack.push(x);

        if (x >= maxStack.peek())
            maxStack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(maxStack.peek()))
            maxStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack ms = new MaxStack();

        ms.push(1);
        ms.push(2);
        ms.push(-1);
        ms.push(-3);

        System.out.println(ms.getMax());

        ms.pop();
        System.out.println(ms.getMax());

        ms.pop();
        System.out.println(ms.getMax());

        ms.pop();
        System.out.println(ms.getMax());

        ms.pop();
        System.out.println(ms.getMax());
    }
}
