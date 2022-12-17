package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public class InternetOrdersManager implements OrderManager, Serializable {
    private QueueNode head;
    private QueueNode tail;
    private int size;
    private class QueueNode implements Serializable {
        private QueueNode next;
        private QueueNode prev;
        private Order value;
    }
    public InternetOrdersManager(){
        head = null;
        tail = null;
        size = 0;
    }
    public int itemsQuantity(String itemName){
        int quantity = 0;
        QueueNode temp = head;
        for (int i = 0; i < size; i++) {
            quantity += temp.value.itemsQuantity(itemName);
            temp = temp.next;
        }
        return quantity;
    }
    public int itemsQuantity(MenuItem item){
        int quantity = 0;
        QueueNode temp = head;
        for (int i = 0; i < size; i++) {
            quantity += temp.value.itemsQuantity(item);
            temp = temp.next;
        }
        return quantity;
    }
    public Order[] getOrders(){
        Order[] orders = new Order[size];
        QueueNode temp = head;
        for (int i = 0; i < size; i++) {
            orders[i] = temp.value;
            temp = temp.next;
        }
        return orders;
    }
    public int ordersCostSummary(){
        int cost = 0;
        QueueNode temp = head;
        for (int i = 0; i < size; i++) {
            cost += temp.value.costTotal();
            temp = temp.next;
        }
        return cost;
    }
    public int ordersQuantity(){
        return size;
    }
    public boolean add(Order order){
        QueueNode newNode = new QueueNode();
        newNode.value = order;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }
    public Order remove(){
        if (head == null) {
            return null;
        }
        Order order = head.value;
        head = head.next;
        size--;
        return order;
    }
    public Order order(){
        if (head == null) {
            return null;
        }
        return head.value;
    }
    public void print(){
        QueueNode temp = head;
        for (int i = 0; i < size; i++) {
            temp.value.print();
            temp = temp.next;
        }
    }
}
