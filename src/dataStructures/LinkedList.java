package dataStructures;

public class LinkedList {
    Node head, tail;

    class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void push(int value) {
        Node temp = new Node(value);

        temp.next = head;

        if (head == null) {
            head = tail = temp;
        } else {
            head = temp;
        }
    }

    public void append(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        tail = temp;
    }


    public void print() {
        Node curr = head;

        while (curr != null) {
            System.out.printf("%s ", curr.data);
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.push(-1);

        list.print();

    }
}
