package ru.minusd.zakatov.lab29.managers;

import ru.minusd.zakatov.lab29.items.MenuItem;
import ru.minusd.zakatov.lab29.orders.Order;

import java.io.Serializable;

public interface OrdersManager extends Serializable {
    long serialVersionUID = 1L;

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
