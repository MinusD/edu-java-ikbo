package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public class TableOrdersManager implements OrderManager, Serializable {
    private Order[] orders;
    public TableOrdersManager() {
        orders = new Order[10];
    }
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity += orders[i].itemsQuantity(itemName);
            }
        }
        return quantity;
    }
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity += orders[i].itemsQuantity(item);
            }
        }
        return quantity;
    }
    public Order[] getOrders() {
        return orders;
    }
    public int ordersCostSummary() {
        int cost = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                cost += orders[i].costTotal();
            }
        }
        return cost;
    }
    public int ordersQuantity() {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }
    public void add(Order order, int tableNumber) {
        if (tableNumber < 0 || tableNumber >= orders.length) {
            return;
        }
        if (orders[tableNumber] != null) {
            return;
        }
        orders[tableNumber] = order;
    }
    public boolean remove(int tableNumber) {
        if (orders[tableNumber] != null) {
            orders[tableNumber] = null;
            return true;
        }
        return false;
    }
    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }
    public void addItem(MenuItem item, int tableNumber) {
        orders[tableNumber].add(item);
    }
    public int[] freeTableNumbers() {
        int[] freeTables = new int[orders.length];
        int freeTablesCount = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                freeTables[freeTablesCount] = i;
                freeTablesCount++;
            }
        }
        int[] result = new int[freeTablesCount];
        System.arraycopy(freeTables, 0, result, 0, freeTablesCount);
        return result;
    }
    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }
    public void remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
            }
        }
    }
    public int removeAll(Order order) {
        int removed = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                removed++;
            }
        }
        return removed;
    }
}
