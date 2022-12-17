package ru.minusd.vasiliev.lab30.classes.orders;

import ru.minusd.vasiliev.lab30.classes.Customer;
import ru.minusd.vasiliev.lab30.classes.items.MenuItem;
import ru.minusd.vasiliev.lab30.interfaces.Order;

public class TableOrder implements Order {
    private Customer customer;

    private int size = 0;
    private MenuItem[] items;

    public TableOrder(int size, Customer customer) {
        items = new MenuItem[size];
        this.customer = customer;
    }

    @Override
    public boolean add(MenuItem item) {
        if (size < items.length) {
            items[size] = item;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String name) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] itemsCopy = new MenuItem[size];
        System.arraycopy(items, 0, itemsCopy, 0, size);
        return itemsCopy;
    }

    @Override
    public boolean remove(String name) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                quantity++;
                i--;
            }
        }
        return quantity;
    }

    @Override
    public int removeAll(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                quantity++;
                i--;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] itemsCopy = new MenuItem[size];
        System.arraycopy(items, 0, itemsCopy, 0, size);
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (itemsCopy[j].getCost() < itemsCopy[j + 1].getCost()) {
                    MenuItem temp = itemsCopy[j];
                    itemsCopy[j] = itemsCopy[j + 1];
                    itemsCopy[j + 1] = temp;
                }
            }
        }
        return itemsCopy;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
