package ru.minusd.vasiliev.lab23.task1;

// Инвариант: size >= 0 && (size == 0 && head == tail || size > 0 && head != tail)
public class ArrayQueueModule {
    private static final int INITIAL_SIZE = 100;
    private static Object array[];
    private static int size;
    private static int head;
    private static int tail;

    public ArrayQueueModule() {
        array = new Object[INITIAL_SIZE];
        size = head = tail = 0;
    }

    // Предусловие: capacity > 0
    // Постусловие: размер массива увеличен вдвое, если capacity >= array.length
    private static void setCapacity(int capacity) {
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

    // Предусловие: element != null
    // Постусловие: добавлен элемент element в конец очереди
    public static void enqueue(Object element) {
        setCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    // Предусловие: size > 0
    // Постусловие: возвращён первый элемент очереди
    public static Object element() {
        return array[head];
    }

    // Предусловие: size > 0
    // Постусловие: возвращён первый элемент очереди и удалён из очереди
    public static Object dequeue() {
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    // Предусловие: element != null
    // Постусловие: добавлен элемент element в начало очереди
    public static void push(Object element) {
        setCapacity(size + 1);
        head = (head == 0) ? array.length - 1 : head - 1;
        array[head] = element;
        size++;
    }

    // Предусловие: size > 0
    // Постусловие: возвращён последний элемент очереди
    public static Object peek() {
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    // Предусловие: size > 0
    // Постусловие: возвращён последний элемент очереди и удалён из очереди
    public static Object remove() {
        Object result = peek();
        tail = tail == 0 ? array.length - 1 : --tail;
        array[tail] = null;
        size--;
        return result;
    }

    // Предусловие: нет
    // Постусловие: возвращён размер очереди
    public static int size() {
        return size;
    }

    // Предусловие: нет
    // Постусловие: возвращено, пуста ли очередь
    public static boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: нет
    // Постусловие: очередь очищена
    public static void clear() {
        size = head = tail = 0;
        array = new Object[INITIAL_SIZE];
    }

    // Предусловие: нет
    // Постусловие: возвращён массив, содержащий элементы очереди
    public static Object[] toArray() {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array, head, temp, 0, count);
        if (tail < head)
            System.arraycopy(array, 0, temp, count, tail);
        return temp;
    }
}