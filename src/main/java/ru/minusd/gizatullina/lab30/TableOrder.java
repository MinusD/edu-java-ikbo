package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public class TableOrder implements Order, Serializable {
    private int size;
    private Customer customer;
    private MenuItem[] items;
    public TableOrder() {
        size = 0;
        items = new MenuItem[10];
    }
    public boolean add(MenuItem item) {
        if (size == items.length) {
            MenuItem[] newItems = new MenuItem[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size] = item;
        size++;
        return true;
    }
    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }
    public int itemsQuantity() {
        return size;
    }
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }
    public MenuItem[] getItems() {
        return items;
    }
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }
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
    public int removeAll(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                quantity++;
                i--;
            }
        }
        return quantity;
    }
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
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i].getName());
        }
    }
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sortedItems = new MenuItem[size];
        System.arraycopy(items, 0, sortedItems, 0, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (sortedItems[j].getPrice() < sortedItems[j + 1].getPrice()) {
                    MenuItem temp = sortedItems[j];
                    sortedItems[j] = sortedItems[j + 1];
                    sortedItems[j + 1] = temp;
                }
            }
        }
        return sortedItems;
    }
    public int costTotal() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
