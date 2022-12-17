package ru.minusd.gizatullina.lab29;

import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> orders = new HashMap<>();
    public void add(String address, Order order) {
        try {
            if(orders.containsKey(address)) {
                throw new OrderAlreadyAddedException("Order already added");
            }
            orders.put(address, order);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
    }
    public Order getOrder(String address) {
        return orders.get(address);
    }
    public void remove(String address) {
        orders.remove(address);
    }
    public String getAddress(Order order) {
        for (String address : orders.keySet()) {
            if (orders.get(address) == order) {
                return address;
            }
        }
        return null;
    }
    public void addItem(String address, Item item) {
        orders.get(address).add(item);
    }
    public Order[] getOrders() {
        Order[] ordersArray = new Order[orders.size()];
        return orders.values().toArray(ordersArray);
    }
    public int ordersCostSummary() {
        int summary = 0;
        for (Order order : orders.values()) {
            summary += order.costTotal();
        }
        return summary;
    }
    public int sameDishQuantity(String dishName) {
        int quantity = 0;
        for (Order order : orders.values()) {
            quantity += order.itemsQuantity(dishName);
        }
        return quantity;
    }
}