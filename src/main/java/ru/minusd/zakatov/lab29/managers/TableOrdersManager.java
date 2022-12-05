package ru.minusd.zakatov.lab29.managers;

import ru.minusd.zakatov.lab29.extensions.IllegalTableNumber;
import ru.minusd.zakatov.lab29.extensions.OrderAlreadyAddedException;
import ru.minusd.zakatov.lab29.items.MenuItem;
import ru.minusd.zakatov.lab29.orders.Order;
import ru.minusd.zakatov.lab29.orders.TableOrder;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;
    private int size;

    public TableOrdersManager(int capacity) {
        this.orders = new Order[capacity];
    }

    private void checkTableNumber(int tableNumber) {
        if (tableNumber < 0 || tableNumber >= orders.length) {
            throw new IllegalTableNumber();
        }
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        checkTableNumber(tableNumber);

        if (orders[tableNumber] != null) {
            throw new OrderAlreadyAddedException();
        }
        orders[tableNumber] = order;
        size++;
    }

    public void add(MenuItem item, int tableNumber) {
        checkTableNumber(tableNumber);

        if (orders[tableNumber] == null) {
            Order order = new TableOrder(20);
            orders[tableNumber] = order;
            size++;
        }
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null)
                return i;
        }

        return -1;
    }

    public int[] freeTableNumbers() {
        int[] numbers = new int[orders.length - size];
        int j = 0;

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null)
                numbers[j++] = i;
        }

        return numbers;
    }

    public Order getOrder(int tableNumber) {
        checkTableNumber(tableNumber);
        return orders[tableNumber];
    }

    public void remove(int tableNumber) {
        checkTableNumber(tableNumber);
        orders[tableNumber] = null;
    }

    public int remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                return i;
            }
        }

        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                count++;
            }
        }

        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;

        for (Order order : orders) {
            if (order == null)
                continue;
            count += order.itemQuantity(itemName);
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;

        for (Order order : orders) {
            if (order == null)
                continue;
            count += order.itemQuantity(item);
        }

        return count;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int costSummary = 0;

        for (Order order : orders) {
            costSummary += (order == null ? 0 : order.costTotal());
        }

        return costSummary;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
