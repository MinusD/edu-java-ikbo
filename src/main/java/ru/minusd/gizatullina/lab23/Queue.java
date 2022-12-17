package ru.minusd.gizatullina.lab23;

public interface Queue {

    // Предусловие : element != null
    // Постусловие : n = n' + 1 && a[n] = element
    void enqueue(Object element);

    // Предусловие : size > 0
    // Постусловие : n = n' - 1 && a'[0] = a[0]
    Object dequeue();

    // Предусловие : size > 0
    // Постусловие : n = n' && a'[0] = a[0]
    Object element();

    // Предусловие : true
    // Постусловие : n = n' && a'[0] = a[0]
    int size();

    // Предусловие : true
    // Постусловие : n = n' && a'[0] = a[0]
    boolean isEmpty();

    // Предусловие : true
    // Постусловие : n = 0
    void clear();
}