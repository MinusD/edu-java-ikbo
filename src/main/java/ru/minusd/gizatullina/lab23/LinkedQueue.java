package ru.minusd.gizatullina.lab23;

public class LinkedQueue extends AbstractQueue {
    private Node head, tail;

    protected Object doElement() {
        return head.value;
    }

    protected void doEnqueue(Object element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    protected Object doDequeue() {
        Object res = head.value;
        head = head.next;
        return res;
    }

    protected void doClear() {
        head = null;
        tail = null;
    }
    private static class Node {
        Object value;
        Node next;

        public Node(Object value, Node next) {
            assert value != null;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        AbstractQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.clear();
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
    }
}
