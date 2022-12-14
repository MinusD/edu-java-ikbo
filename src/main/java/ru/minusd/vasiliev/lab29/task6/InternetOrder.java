package ru.minusd.vasiliev.lab29.task6;

import ru.minusd.vasiliev.lab29.LinkedList;
import ru.minusd.vasiliev.lab29.task2.Item;

public class InternetOrder implements Order {
    private LinkedList items;

    public InternetOrder() {
        this.items = new LinkedList();
    }

    public InternetOrder(Item[] items) {
        this.items = new LinkedList();
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public boolean add(Item item) {
        return items.add(item);
    }

    public String[] itemsNames() {
        String[] names = new String[items.size()];
        for (int i = 0; i < items.size(); i++) {
            names[i] = ((Item) items.get(i)).getName();
        }
        return names;
    }

    public int itemsQuantity() {
        return items.size();
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < items.size(); i++) {
            if (((Item) items.get(i)).getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int itemsQuantity(Item item) {
        int quantity = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }

    public Item[] getItems() {
        Item[] itemsArray = new Item[items.size()];
        for (int i = 0; i < items.size(); i++) {
            itemsArray[i] = (Item) items.get(i);
        }
        return itemsArray;
    }

    public boolean remove(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(itemName)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean remove(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public int removeAll(String itemName) {
        int quantity = 0;
        for (int i = 0; i < items.size(); i++) {
            if (((Item) items.get(i)).getName().equals(itemName)) {
                items.remove(i);
                quantity++;
            }
        }
        return quantity;
    }

    public int removeAll(Item item) {
        int quantity = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                quantity++;
            }
        }
        return quantity;
    }

    public Item[] sortedItemsByCostDesc() {
        Item[] itemsArray = getItems();
        for (int i = 0; i < itemsArray.length; i++) {
            for (int j = i + 1; j < itemsArray.length; j++) {
                if (itemsArray[i].getCost() < itemsArray[j].getCost()) {
                    Item temp = itemsArray[i];
                    itemsArray[i] = itemsArray[j];
                    itemsArray[j] = temp;
                }
            }
        }
        return itemsArray;
    }

    public int costTotal() {
        int totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            totalCost += ((Item) items.get(i)).getCost();
        }
        return totalCost;
    }

    public int costTotal(String itemName) {
        int totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            if (((Item) items.get(i)).getName().equals(itemName)) {
                totalCost += ((Item) items.get(i)).getCost();
            }
        }
        return totalCost;
    }

    public int costTotal(Item item) {
        int totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                totalCost += ((Item) items.get(i)).getCost();
            }
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "InternetOrder{" +
                "items=" + items.toString() +
                '}';
    }
}
