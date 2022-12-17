package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public class InternetOrder implements Order, Serializable {
    private ListNode head;
    private ListNode tail;
    private int size;
    private Customer customer;
    private class ListNode implements Serializable {
        private ListNode next;
        private MenuItem value;
    }
    public InternetOrder(Customer customer) {
        head = null;
        tail = null;
        size = 0;
        this.customer = customer;
    }

    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode();
        newNode.value = item;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    public String[] itemsNames() {
        String[] names = new String[size];
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            names[i] = temp.value.getName();
            temp = temp.next;
        }
        return names;
    }

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value.getName().equals(itemName)) {
                quantity++;
            }
            temp = temp.next;
        }
        return quantity;
    }

    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(item)) {
                quantity++;
            }
            temp = temp.next;
        }
        return quantity;
    }

    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            items[i] = temp.value;
            temp = temp.next;
        }
        return items;
    }

    public boolean remove(String itemName) {
        ListNode temp = head;
        ListNode prev = null;
        for (int i = 0; i < size; i++) {
            if (temp.value.getName().equals(itemName)) {
                if (temp == head) {
                    head = temp.next;
                } else if (temp == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = temp.next;
                }
                size--;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }


    public boolean remove(MenuItem item){
        ListNode temp = head;
        ListNode prev = null;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(item)) {
                if (temp == head) {
                    head = temp.next;
                } else if (temp == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = temp.next;
                }
                size--;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }

    public int removeAll(String itemName){
        int quantity = 0;
        ListNode temp = head;
        ListNode prev = null;
        for (int i = 0; i < size; i++) {
            if (temp.value.getName().equals(itemName)) {
                if (temp == head) {
                    head = temp.next;
                } else if (temp == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = temp.next;
                }
                size--;
                quantity++;
            }
            prev = temp;
            temp = temp.next;
        }
        return quantity;
    }

    public int removeAll(MenuItem item){
        int quantity = 0;
        ListNode temp = head;
        ListNode prev = null;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(item)) {
                if (temp == head) {
                    head = temp.next;
                } else if (temp == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = temp.next;
                }
                size--;
                quantity++;
            }
            prev = temp;
            temp = temp.next;
        }
        return quantity;
    }

    public MenuItem[] sortedItemsByCostDesc(){
        MenuItem[] items = getItems();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (items[j].getPrice() < items[j + 1].getPrice()) {
                    MenuItem temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    public void print(){
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public int costTotal(){
        int total = 0;
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            total += temp.value.getPrice();
            temp = temp.next;
        }
        return total;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
