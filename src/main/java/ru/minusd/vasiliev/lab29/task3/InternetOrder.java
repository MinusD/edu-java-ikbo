package ru.minusd.vasiliev.lab29.task3;

import ru.minusd.vasiliev.lab29.task2.Item;

public class InternetOrder {
    private TablesOrderManager manager;

    public InternetOrder() {
        manager = new TablesOrderManager();
    }

    public InternetOrder(Item[] items) {
        manager = new TablesOrderManager();
        for (Item item : items) {
            manager.add(item);
        }
    }
}
