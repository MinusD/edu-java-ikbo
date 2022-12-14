package ru.minusd.vasiliev.lab29.task3;

import ru.minusd.vasiliev.lab29.task2.Item;

public class Order {
    public Item item;
    public Order next;
    public Order prev;

    public Order(Item item) {
        this.item = item;
    }
}
