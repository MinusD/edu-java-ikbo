package ru.minusd.vasiliev.lab23.task2;

public interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    void push(Object element);
    Object peek();
    Object remove();
    int size();
    boolean isEmpty();
    void clear();
}
