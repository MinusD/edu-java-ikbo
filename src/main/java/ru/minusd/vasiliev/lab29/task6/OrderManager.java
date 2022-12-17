package ru.minusd.vasiliev.lab29.task6;

import ru.minusd.vasiliev.lab29.task2.Item;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> orders = new HashMap<>();

    public boolean add(String orderId, Order order) throws OrderAlreadyAddedException {
        if (orders.containsKey(orderId)) {
            throw new OrderAlreadyAddedException(orderId);
        }
        orders.put(orderId, order);
        return true;
    }

    public Order getOrder(String orderId) {
        checkTable(orderId);
        return orders.get(orderId);
    }

    public void removeOrder(String orderId) {
        checkTable(orderId);
        orders.remove(orderId);
    }

    public void addItem(String orderId, Item item) {
        checkTable(orderId);
        orders.get(orderId).add(item);
    }

    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }

    public int ordersSum() {
        int sum = 0;
        for (Order order : orders.values()) {
            sum += order.costTotal();
        }
        return sum;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order order : orders.values()) {
            quantity += order.itemsQuantity(itemName);
        }
        return quantity;
    }

    private void checkTable(String orderId) {
        if (!orders.containsKey(orderId)) {
            throw new IllegalTableNumber(orderId);
        }
    }
}
