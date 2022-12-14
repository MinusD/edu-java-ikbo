package ru.minusd.vasiliev.lab29.task4;

import ru.minusd.vasiliev.lab29.task2.Item;

public class TablesOrderManager {
    private static class Node {
        private Item item;
        private Node next;
        private Node prev;

        public Node(Item item) {
            this.item = item;
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
                if (current == head) {
                    head.next.prev = head.prev;
                    head.prev.next = head.next;
                    head = head.next;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        } while (current != head);
    }
}
