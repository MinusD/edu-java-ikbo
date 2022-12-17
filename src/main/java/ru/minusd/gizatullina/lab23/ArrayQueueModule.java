package ru.minusd.gizatullina.lab23;

import java.util.Arrays;

public class ArrayQueueModule {
    static int size = 0;
    static Object[] elements = new Object[10];
    static int head = 0;
    static int tail = 0;

    static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        elements = Arrays.copyOf(elements, 2 * capacity);
        head = 0;
        tail = size;
    }

    static Object dequeue() {
        assert size > 0;
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    static Object element() {
        assert size > 0;
        return elements[head];
    }

    static int size() {
        return size;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    static void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void main(String[] args) {
        enqueue(1);
        clear();
        enqueue(2);
        enqueue(3);
        System.out.println("Queue element: ");
        System.out.println(element());
        System.out.println("Dequeue: ");
        System.out.println(dequeue());
        System.out.println("Queue element: ");
        System.out.println(element());
    }
}