package ru.minusd.gizatullina.lab23;

public class ArrayQueue extends AbstractQueue {
    private Object[] elements = new Object[10];
    private int head;
    private int tail;

    public void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }

    protected void doEnqueue(Object element) {
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    protected Object doElement() {
        return elements[head];
    }

    protected Object doDequeue() {
        Object result = elements[head];
        head = (head + 1) % elements.length;
        return result;
    }

    protected void doClear() {
        head = 0;
        tail = 0;
    }

    public static void main(String[] args) {
        AbstractQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.clear();
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue element: ");
        System.out.println(queue.element());
        System.out.println("Dequeue: ");
        System.out.println(queue.dequeue());
        System.out.println("Queue element: ");
        System.out.println(queue.element());
    }
}