package ru.minusd.vasiliev.lab31.classes.managers;

import ru.minusd.vasiliev.lab31.classes.items.MenuItem;
import ru.minusd.vasiliev.lab31.classes.orders.InternetOrder;
import ru.minusd.vasiliev.lab31.classes.utility.QueueNode;
import ru.minusd.vasiliev.lab31.interfaces.Order;
import ru.minusd.vasiliev.lab31.interfaces.OrdersManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager() {
        head = null;
        tail = null;
        size = 0;
    }

    public InternetOrdersManager(QueueNode head, QueueNode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
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

    public static InternetOrdersManager fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return InternetOrdersManager.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static InternetOrdersManager fromString(String state) {
        return new InternetOrdersManager(
                QueueNode.fromString(state.split("head=")[1].split(",")[0]),
                QueueNode.fromString(state.split("tail=")[1].split(",")[0]),
                Integer.parseInt(state.split("size=")[1].split("}")[0])
        );
    }

    @Override
    public String toString() {
        return "InternetOrdersManager{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
