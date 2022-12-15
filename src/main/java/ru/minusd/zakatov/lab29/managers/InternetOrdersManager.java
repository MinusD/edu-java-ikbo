package ru.minusd.zakatov.lab29.managers;

import ru.minusd.zakatov.lab29.Address;
import ru.minusd.zakatov.lab29.extensions.OrderAlreadyAddedException;
import ru.minusd.zakatov.lab29.items.MenuItem;
import ru.minusd.zakatov.lab29.orders.Order;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public boolean add(Order order) throws OrderAlreadyAddedException {
        if (orderAlreadyExist(order)) {
            throw new OrderAlreadyAddedException();
        }

        QueueNode node = new QueueNode();
        node.value = order;
        size++;

        if (head == null) {
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }

        tail = node;

        return true;
    }

    private boolean orderAlreadyExist(Order order) {
        QueueNode node = head;

        while (node != null) {
            Address orderAddress = order.getCustomer().getAddress();
            if (orderAddress.equals(node.value.getCustomer().getAddress())) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public Order remove() {
        QueueNode removed = tail;
        tail = tail.prev;

        if (size == 1) {
            head = null;
        }

        size--;
        return removed.value;
    }

    public Order order() {
        return tail.value;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }

    private static class QueueNode {
        protected QueueNode next;
        protected QueueNode prev;
        protected Order value;
    }
}
