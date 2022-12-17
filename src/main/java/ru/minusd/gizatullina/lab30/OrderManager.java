package ru.minusd.gizatullina.lab30;

import java.util.HashMap;

public interface OrderManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int ordersQuantity();
}
