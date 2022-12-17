package ru.minusd.vasiliev.lab30.interfaces;

import ru.minusd.vasiliev.lab30.classes.items.MenuItem;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
