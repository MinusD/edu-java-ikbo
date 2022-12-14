package ru.minusd.vasiliev.lab29.task5;

import ru.minusd.vasiliev.lab29.task2.Item;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> orders = new HashMap<>();

    public boolean add(String orderId, Order order) {
        if (orders.containsKey(orderId)) {
            return false;
        }
        orders.put(orderId, order);
        return true;
    }

    public Order getOrder(String orderId) {
        return orders.get(orderId);
    }

    public void removeOrder(String orderId) {
        orders.remove(orderId);
    }

    public void addItem(String orderId, Item item) {
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
}
