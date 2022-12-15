package ru.minusd.zakatov.lab29.orders;

import ru.minusd.zakatov.lab29.Customer;
import ru.minusd.zakatov.lab29.items.MenuItem;

import java.util.Arrays;

public class InternetOrder implements Order {
    private int size = 0;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        ListNode node = new ListNode();
        node.value = item;
        size++;

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;

        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        ListNode node = head;

        for (int i = 0; i < size; i++) {
            names[i] = node.value.getName();
            node = node.next;
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
        ListNode node = head;

        for (int i = 0; i < size; i++) {
            if (itemName.equals(node.value.getName())) {
                count++;
            }
            node = node.next;
        }

        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int count = 0;
        ListNode node = head;

        for (int i = 0; i < size; i++) {
            if (item.equals(node.value)) {
                count++;
            }
            node = node.next;
        }

        return count;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode node = head;

        for (int i = 0; i < size; i++) {
            items[i] = node.value;
            node = node.next;
        }

        return items;
    }

    private void remove(ListNode node) {
        ListNode temp = head;

        while (temp.next != node) {
            temp = temp.next;
        }

        temp.next = node.next;

        if (node == head) {
            head = node.next;
        } else if (node == tail) {
            tail = temp;
        }
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = head;

        while (!itemName.equals(node.value.getName())) {
            node = node.next;
        }

        remove(node);
        return true;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode node = head;

        while (!item.equals(node.value)) {
            node = node.next;
        }

        remove(node);
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode node = head;

        while (node != null) {
            if (itemName.equals(node.value.getName())) {
                remove(node);
                count++;
            }
            node = node.next;
        }

        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        ListNode node = head;

        while (node != null) {
            if (item.equals(node.value)) {
                remove(node);
                count++;
            }
            node = node.next;
        }

        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sorted = getItems();
        Arrays.sort(sorted, (i1, i2) -> Integer.compare(i2.getCost(), i1.getCost()));
        return sorted;
    }

    @Override
    public int costTotal() {
        int costTotal = 0;
        ListNode node = head;

        while (node != null) {
            costTotal += node.value.getCost();
            node = node.next;
        }

        return costTotal;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private static class ListNode {
        protected ListNode next;
        protected MenuItem value;
    }
}
