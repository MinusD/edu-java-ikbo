package ru.minusd.vasiliev.lab23.task2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList<Object> list;

    @Override
    public void enqueue(Object element) {
        list.addLast(element);
    }

    @Override
    public Object element() {
        return list.getFirst();
    }

    @Override
    public Object dequeue() {
        return list.removeFirst();
    }

    @Override
    public void push(Object element) {
        list.addFirst(element);
    }

    @Override
    public Object peek() {
        return list.getLast();
    }

    @Override
    public Object remove() {
        return list.removeLast();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
