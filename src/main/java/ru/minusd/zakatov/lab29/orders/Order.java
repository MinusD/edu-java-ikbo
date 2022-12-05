package ru.minusd.zakatov.lab29.orders;

import ru.minusd.zakatov.lab29.Customer;
import ru.minusd.zakatov.lab29.items.MenuItem;

import java.io.Serializable;

public interface Order extends Serializable {
    long serialVersionUID = 1L;

    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
