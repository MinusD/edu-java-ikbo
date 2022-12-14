package ru.minusd.vasiliev.lab31.classes.managers;

import ru.minusd.vasiliev.lab31.classes.items.MenuItem;
import ru.minusd.vasiliev.lab31.interfaces.Order;
import ru.minusd.vasiliev.lab31.interfaces.OrdersManager;

public class TableOrdersManager implements OrdersManager {
    private final Order[] orders;

    public TableOrdersManager(int size) {
        orders = new Order[size];
    }

    public void add(Order order, int tableNumber) {
            orders[tableNumber] = order;
    }

    public void addItem(MenuItem item, int tableNumber) {
        orders[tableNumber].add(item);
    }

    public void remove(int tableNumber) {
        orders[tableNumber] = null;
    }

    public int remove(Order order) {
        int tableNumber = -1;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                tableNumber = i;
            }
        }
        return tableNumber;
    }

    public int removeAll(Order order) {
        int tableNumber = -1;
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                tableNumber = i;
                count++;
            }
        }
        return count;
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
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
        for (int i = 0; i < freeTablesCount; i++) {
            result[i] = freeTables[i];
        }
        return result;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity += orders[i].itemsQuantity(itemName);
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity += orders[i].itemsQuantity(item);
            }
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                cost += orders[i].costTotal();
            }
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int quantity = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }
}
