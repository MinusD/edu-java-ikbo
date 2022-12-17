package ru.minusd.vasiliev.lab29.task3;

import ru.minusd.vasiliev.lab29.task2.Item;

public class TablesOrderManager {
    private Order head;

    public boolean add(Item item) {
        Order node = new Order(item);
        if (head == null) {
            head = node;
        } else {
            Order current = head;
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
        Order current = head;
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
