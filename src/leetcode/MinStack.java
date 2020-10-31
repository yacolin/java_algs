package leetcode;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s;
    int min;

    public MinStack() {
        s = new Stack<Integer>();
    }

    public void push(int x) {
        if (s.isEmpty()) {
            min = x;
        } else {
            if (x < min) {
                min = x;
            }
        }

        s.push(x);

    }

    public void pop() {
        int top = top();
        s.pop();

        if (top == min) {
            min = top();

            for (Integer x : s) {
                if ( x < min) {
                    min = x;
                }
            }
        }
    }

    public int top() {
        int x = s.peek();

        return x;
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        int min;

        ms.push(1);
        ms.push(2);

        min = ms.getMin();
        System.out.println(min);
        System.out.println(ms.top());

        ms.pop();
        min = ms.getMin();
        System.out.println(min);
    }
}
