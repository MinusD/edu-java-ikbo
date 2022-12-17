package ru.minusd.gizatullina.lab29;

public interface Order {
    boolean add(Item item);
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Item[] getItems();
    boolean remove(String itemName);
    boolean remove(Item item);
    int removeAll(String itemName);
    int removeAll(Item item);
    Item[] sortedItemsByCostDesc();
    int costTotal();
}
