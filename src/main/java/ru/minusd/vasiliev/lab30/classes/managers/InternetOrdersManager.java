package ru.minusd.vasiliev.lab30.classes.managers;

import ru.minusd.vasiliev.lab30.classes.items.MenuItem;
import ru.minusd.vasiliev.lab30.classes.utility.QueueNode;
import ru.minusd.vasiliev.lab30.interfaces.Order;
import ru.minusd.vasiliev.lab30.interfaces.OrdersManager;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Order order) {
        if (head == null) {
            head = new QueueNode(order);
            tail = head;
        } else {
            tail.setNext(new QueueNode(order));
            tail = tail.getNext();
        }
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) {
            return null;
        }
        Order order = head.getValue();
        head = head.getNext();
        size--;
        return order;
    }

    public Order order() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            quantity += current.getValue().itemsQuantity(itemName);
            current = current.getNext();
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            quantity += current.getValue().itemsQuantity(item);
            current = current.getNext();
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            orders[i] = current.getValue();
            current = current.getNext();
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode current = head;
        for (int i = 0; i < size; i++) {
            cost += current.getValue().costTotal();
            current = current.getNext();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
