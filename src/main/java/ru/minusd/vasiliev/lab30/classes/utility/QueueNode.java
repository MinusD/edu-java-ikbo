package ru.minusd.vasiliev.lab30.classes.utility;

import ru.minusd.vasiliev.lab30.classes.items.MenuItem;
import ru.minusd.vasiliev.lab30.interfaces.Order;

public class QueueNode {
    private QueueNode next;
    private QueueNode prev;
    private Order value;

    public QueueNode(Order value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public QueueNode getPrev() {
        return prev;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public Order getValue() {
        return value;
    }

    public void setValue(Order value) {
        this.value = value;
    }
}
