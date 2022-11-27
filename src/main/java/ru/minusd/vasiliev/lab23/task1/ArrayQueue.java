package ru.minusd.vasiliev.lab23.task1;

// Инвариант: size >= 0 && (size == 0 && head == tail || size > 0 && head != tail)
public class ArrayQueue {
    private final int INITIAL_SIZE = 10;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        array = new Object[INITIAL_SIZE];
        size = head = tail = 0;
    }


    // Предусловие: заданная ёмкость больше 0
    // Постусловие: если заданная ёмкость больше текущей, то массив увеличивается в два раза
    private void setCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length * 2];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    // Предусловие: заданный элемент не null
    // Постусловие: заданный элемент добавлен в конец очереди
    public void enqueue(Object element) {
        setCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент очереди возвращён
    public Object element() {
        return array[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент очереди удалён и возвращён
    public Object dequeue() {
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    // Предусловие: заданный элемент не null
    // Постусловие: заданный элемент добавлен в начало очереди
    public void push(Object element) {
        setCapacity(size + 1);
        head = (head == 0) ? array.length - 1 : head - 1;
        array[head] = element;
        size++;
    }

    // Предуслоие: очередь не пуста
    // Постусловие: последний элемент очереди возвращён
    public Object peek() {
        assert size > 0;
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    // Предусловие: очередь не пуста
    // Постусловие: последний элемент очереди удалён и возвращён
    public Object remove() {
        Object result = peek();
        tail = tail == 0 ? array.length - 1 : --tail;
        array[tail] = null;
        size--;
        return result;
    }

    // Предусловие: нет
    // Постусловие: размер очереди возвращён
    public int size() {
        return size;
    }

    // Предусловие: нет
    // Постусловие: пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: нет
    // Постусловие: очередь очищена
    public void clear() {
        size = head = tail = 0;
        array = new Object[INITIAL_SIZE];
    }

    // Предуслоие: нет
    // Постусловие: очередь преобразована в массив
    public Object[] toArray() {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array, head, temp, 0, count);
        if (tail < head)
            System.arraycopy(array, 0, temp, count, tail);
        return temp;
    }
}