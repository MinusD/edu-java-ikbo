package ru.minusd.zakatov.lab29.orders;

import ru.minusd.zakatov.lab29.Customer;
import ru.minusd.zakatov.lab29.items.MenuItem;

import java.util.Arrays;

public class TableOrder implements Order {
    private int size = 0;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder(int capacity) {
        items = new MenuItem[capacity];
    }

    @Override
    public boolean add(MenuItem item) {
        if (size >= items.length)
            return false;

        items[size++] = item;
        return true;
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
    public int itemQuantity(String itemName) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (itemName.equals(items[i].getName())) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (item.equals(items[i])) {
                count++;
            }
        }

        return count;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    private void remove(int index) {
        for (int i = index + 1; i <= size; i++) {
            items[i - 1] = (i == size ? null : items[i]);
        }
        size--;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++) {
            if (itemName.equals(items[i].getName())) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(items[i])) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (itemName.equals(items[i].getName())) {
                remove(i);
                count++;
            }
        }

        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (item == items[i]) {
                remove(i);
                count++;
            }
        }

        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sorted = Arrays.copyOf(items, size);
        Arrays.sort(sorted, (i1, i2) -> Integer.compare(i2.getCost(), i1.getCost()));
        return sorted;
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
