package ru.minusd.gizatullina.lab29;

public class InternetOrder implements Order {
    private Node head;
    private Node tail;
    private int size;

    public InternetOrder() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Item item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
        return true;
    }

    public String[] itemsNames() {
        String[] names = new String[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            names[i] = node.getItem().getName();
            node = node.getNext();
        }
        return names;
    }

    public int itemsQuantity() {
        return size;
    }

    public int itemsQuantity(String itemName) {
        Node node = head;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                count++;
            }
            node = node.getNext();
        }
        return count;
    }

    public int itemsQuantity(Item item) {
        return itemsQuantity(item.getName());
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            items[i] = node.getItem();
            node = node.getNext();
        }
        return items;
    }

    public boolean remove(String itemName) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.getItem().getName().equals(itemName)) {
                if (node == head) {
                    head = head.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                } else if (node == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } else {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                }
                size--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public boolean remove(Item item) {
        return remove(item.getName());
    }
    public int removeAll(String itemName) {
        int count = 0;
        while (remove(itemName)) {
            count++;
        }
        return count;
    }
    public int removeAll(Item item) {
        return removeAll(item.getName());
    }
    public Item[] sortedItemsByCostDesc() {
        Item[] items = getItems();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (items[i].getPrice() < items[j].getPrice()) {
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
    public int costTotal() {
        int cost = 0;
        Node node = head;
        for (int i = 0; i < size; i++) {
            cost += node.getItem().getPrice();
            node = node.getNext();
        }
        return cost;
    }

}