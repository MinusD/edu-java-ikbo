package ru.minusd.vasiliev.lab31.classes.orders;

import ru.minusd.vasiliev.lab31.classes.Customer;
import ru.minusd.vasiliev.lab31.classes.items.MenuItem;
import ru.minusd.vasiliev.lab31.interfaces.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TableOrder implements Order {
    private Customer customer;

    private int size = 0;
    private MenuItem[] items;

    public TableOrder(int size, Customer customer) {
        items = new MenuItem[size];
        this.customer = customer;
    }

    public TableOrder(Customer customer, int size, MenuItem[] items) {
        this.customer = customer;
        this.size = size;
        this.items = items;
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

    public static TableOrder fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return TableOrder.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TableOrder fromString(String state) {
        var items = new ArrayList<String>();
        for (var itemStr: state.split("items=\\[")[1].split("]")[0].split("}")) {
            if (!itemStr.contains("MenuItem")) {
                for (var item: itemStr.split(",")) {
                    if (!item.equals("")) {
                        items.add(item);
                    }
                }
                continue;
            }
            items.add(itemStr);
        }
        return new TableOrder(
                Customer.fromString(state.split("customer=Customer\\{")[1].split("}")[0]),
                Integer.parseInt(state.split("size=")[1].split(",")[0]),
                items.stream().map(MenuItem::fromString).toArray(MenuItem[]::new)
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TableOrder{");
        sb.append("customer=").append(customer);
        sb.append(", size=").append(size);
        sb.append(", items=[");
        for (var item: items) {
            if (item != null) {
                sb.append(item.getSerializedString()).append(", ");
            } else {
                sb.append("null, ");
            }
        }
        sb.replace(sb.lastIndexOf(", "), sb.length(), "");
        sb.append("]}");
        return sb.toString();
    }
}
