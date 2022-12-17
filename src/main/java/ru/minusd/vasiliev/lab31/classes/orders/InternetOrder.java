package ru.minusd.vasiliev.lab31.classes.orders;

import ru.minusd.vasiliev.lab31.classes.Address;
import ru.minusd.vasiliev.lab31.classes.Customer;
import ru.minusd.vasiliev.lab31.classes.items.MenuItem;
import ru.minusd.vasiliev.lab31.classes.utility.ListNode;
import ru.minusd.vasiliev.lab31.classes.utility.QueueNode;
import ru.minusd.vasiliev.lab31.interfaces.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InternetOrder implements Order {
    private Customer customer;

    private ListNode head;
    private int size;

    public InternetOrder(Customer customer) {
        head = null;
        size = 0;
        this.customer = customer;
    }

    public InternetOrder(Customer customer, ListNode head, int size) {
        this.customer = customer;
        this.head = head;
        this.size = size;
    }

    public boolean add(MenuItem item) {
        if (head == null) {
            head = new ListNode(item);
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new ListNode(item));
        }
        size++;
        return true;
    }

    public String[] itemsNames() {
        String[] names = new String[size];
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            names[i] = current.getValue().getName();
            current = current.getNext();
        }
        return names;
    }

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.getValue().getName().equals(itemName)) {
                quantity++;
            }
            current = current.getNext();
        }
        return quantity;
    }

    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.getValue().equals(item)) {
                quantity++;
            }
            current = current.getNext();
        }
        return quantity;
    }

    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            items[i] = current.getValue();
            current = current.getNext();
        }
        return items;
    }

    public boolean remove(String itemName) {
        if (head == null) {
            return false;
        }
        if (head.getValue().getName().equals(itemName)) {
            head = head.getNext();
            size--;
            return true;
        }
        ListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().getName().equals(itemName)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean remove(MenuItem item) {
        if (head == null) {
            return false;
        }
        if (head.getValue().equals(item)) {
            head = head.getNext();
            size--;
            return true;
        }
        ListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(item)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int removeAll(String itemName) {
        int quantity = 0;
        while (remove(itemName)) {
            quantity++;
        }
        return quantity;
    }

    public int removeAll(MenuItem item) {
        int quantity = 0;
        while (remove(item)) {
            quantity++;
        }
        return quantity;
    }

    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (items[i].getCost() < items[j].getCost()) {
                    MenuItem temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }

    public int costTotal() {
        int total = 0;
        ListNode current = head;
        for (int i = 0; i < size; i++) {
            total += current.getValue().getCost();
            current = current.getNext();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static InternetOrder fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return InternetOrder.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static InternetOrder fromString(String state) {
        return new InternetOrder(
                Customer.fromString(state.split("customer=")[1].split(",")[0]),
                ListNode.fromString(state.split("head=")[1].split(",")[0]), Integer.parseInt(state.split("size=")[1].split("}")[0]));
    }

    public String toString() {
        return "InternetOrder{" +
                "customer=" + customer +
                ", head=" + head +
                ", size=" + size +
                '}';
    }
}
