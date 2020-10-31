package leetcode;

import java.util.Stack;

public class MaxMinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public MaxMinStack() {
        maxStack.push(Integer.MIN_VALUE);
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);

        if (x >= maxStack.peek())
            maxStack.push(x);

        if (x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        if (stack.pop().equals(maxStack.peek()))
            maxStack.pop();

        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MaxMinStack mms = new MaxMinStack();

        mms.push(1);
        mms.push(2);
        mms.push(-1);
        mms.push(-3);



        mms.pop();
        System.out.println("max:" + mms.getMax());
        System.out.println("mix:" + mms.getMin());

        mms.pop();
        System.out.println("max:" + mms.getMax());
        System.out.println("mix:" + mms.getMin());

    }
}
