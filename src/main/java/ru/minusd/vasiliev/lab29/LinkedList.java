package ru.minusd.vasiliev.lab29;

import ru.minusd.vasiliev.lab29.task2.Item;

public class LinkedList {

    private static class Node {
        private Item item;
        private Node next;
        private Node prev;

        public Node(Item item) {
            this.item = item;
        }

        public Node(Item item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    private Node head;

    public boolean add(Item item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.prev = current;
        }
        head.prev = node;
        node.next = head;
        return true;
    }

    public void remove(String name) {
        Node current = head;
        do {
            if (current.item.getName().equals(name)) {
                removeNode(current);
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        removeNode(current);
    }

    private void removeNode(Node node) {
        if (node == head) {
            head.next.prev = head.prev;
            head.prev.next = head.next;
            head = head.next;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int size() {
        int size = 0;
        Node current = head;
        do {
            size++;
            current = current.next;
        } while (current != head);
        return size;
    }

    public Item get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        do {
            sb.append(current.item).append(", ");
            current = current.next;
        } while (current != head);
        return sb.toString();
    }
}
