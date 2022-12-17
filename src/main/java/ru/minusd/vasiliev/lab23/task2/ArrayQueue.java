package ru.minusd.vasiliev.lab23.task2;

public class ArrayQueue extends AbstractQueue {
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
    // Инвариант: если заданная ёмкость равна удвоенной текущей, то head < tail
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
    @Override
    public void enqueue(Object element) {
        setCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент очереди возвращён
    @Override
    public Object element() {
        return array[head];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент очереди удалён и возвращён
    @Override
    public Object dequeue() {
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    // Предусловие: заданный элемент не null
    // Постусловие: заданный элемент добавлен в начало очереди
    @Override
    public void push(Object element) {
        setCapacity(size + 1);
        head = (head == 0) ? array.length - 1 : head - 1;
        array[head] = element;
        size++;
    }

    // Предуслоие: очередь не пуста
    // Постусловие: последний элемент очереди возвращён
    @Override
    public Object peek() {
        assert size > 0;
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    // Предусловие: очередь не пуста
    // Постусловие: последний элемент очереди удалён и возвращён
    @Override
    public Object remove() {
        Object result = peek();
        tail = tail == 0 ? array.length - 1 : --tail;
        array[tail] = null;
        size--;
        return result;
    }

    // Предусловие: нет
    // Постусловие: размер очереди возвращён
    @Override
    public int size() {
        return size;
    }

    // Предусловие: нет
    // Постусловие: пуста ли очередь
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Инвариант: новый размер очереди равен 0
    // Предусловие: нет
    // Постусловие: очередь очищена
    @Override
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