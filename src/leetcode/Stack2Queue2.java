package leetcode;

import java.util.Stack;

public class Stack2Queue2 {
    Stack<Integer> s1, s2;
    int front;

    public Stack2Queue2() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        front = 0;
    }

    // push element x to the back of queue
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.push(x);
    }


    // remove the element from in front of queue and return it
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // get the front element
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    // return whether the queue is empty
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    public static void main(String[] args) {
        Stack2Queue2 queue2 = new Stack2Queue2();
        queue2.push(1);
        queue2.push(2);

        System.out.println(queue2.pop());
        System.out.println(queue2.pop());
    }
}
