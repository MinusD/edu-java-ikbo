package ru.minusd.gizatullina.lab23;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size = 0;
    private Object[] elements = new Object[10];
    private int head = 0;
    private int tail = 0;

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        queue.head = 0;
        queue.tail = queue.size;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object result = queue.elements[queue.head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        enqueue(queue, 1);
        clear(queue);
        enqueue(queue, 2);
        enqueue(queue, 3);
        System.out.println("Queue element: ");
        System.out.println(element(queue));
        System.out.println("Dequeue: ");
        System.out.println(dequeue(queue));
        System.out.println("Queue element: ");
        System.out.println(element(queue));
    }
}