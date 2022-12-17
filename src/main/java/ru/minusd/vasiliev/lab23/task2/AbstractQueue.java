package ru.minusd.vasiliev.lab23.task2;

public abstract class AbstractQueue implements Queue {
    public abstract void enqueue(Object element);

    public abstract Object element();

    public abstract Object dequeue();

    public abstract void push(Object element);

    public abstract Object peek();

    public abstract Object remove();

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void clear();
}
