package ru.minusd.gizatullina.lab29;

public class Node {
    private Item item;
    private Node next;
    private Node prev;

    public Node(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
