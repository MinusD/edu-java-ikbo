package ru.minusd.vasiliev.lab23.task1;

// Инвариант: size >= 0 && (size == 0 && head == tail || size > 0 && head != tail)
public class ArrayQueueADT {
    private static final int INITIAL_SIZE = 10;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueueADT() {
        array = new Object[INITIAL_SIZE];
        size = head = tail = 0;
    }

    // Предусловие: capacity > 0
    // Постусловие: размер массива увеличен вдвое, если capacity >= array.length
    private static void setCapacity(ArrayQueueADT adt, int capacity) {
        if (capacity >= adt.array.length) {
            Object[] temp = new Object[adt.array.length * 2];
            int count = adt.tail < adt.head ? adt.array.length - adt.head : adt.size;
            System.arraycopy(adt.array, adt.head, temp, 0, count);
            if (adt.tail < adt.head)
                System.arraycopy(adt.array, 0, temp, count, adt.tail);
            adt.array = temp;
            adt.head = 0;
            adt.tail = adt.size;
        }
    }

    // Предусловие: заданный элемент не null, adt != null
    // Постусловие: заданный элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT adt, Object element) {
        setCapacity(adt, adt.size + 1);
        adt.array[adt.tail] = element;
        adt.tail = (adt.tail + 1) % adt.array.length;
        adt.size++;
    }

    // Предусловие: очередь не пуста, adt != null
    // Постусловие: первый элемент очереди возвращён
    public static Object element(ArrayQueueADT adt) {
        return adt.array[adt.head];
    }

    // Предусловие: очередь не пуста, adt != null
    // Постусловие: первый элемент очереди удалён
    public static Object dequeue(ArrayQueueADT adt) {
        Object result = element(adt);
        adt.array[adt.head] = null;
        adt.size--;
        adt.head = (adt.head + 1) % adt.array.length;
        return result;
    }

    // Предусловие: adt != null, элемент не null
    // Постусловие: заданный элемент добавлен в начало очереди
    public static void push(ArrayQueueADT adt, Object element) {
        setCapacity(adt, adt.size + 1);
        adt.head = (adt.head == 0) ? adt.array.length - 1 : adt.head - 1;
        adt.array[adt.head] = element;
        adt.size++;
    }

    // Предусловие: очередь не пуста, adt != null
    // Постусловие: последний элемент очереди возвращён
    public static Object peek(ArrayQueueADT adt) {
        return adt.array[(adt.tail == 0) ? adt.array.length - 1 : adt.tail - 1];
    }

    // Предусловие: очередь не пуста, adt != null
    // Постусловие: последний элемент очереди удалён
    public static Object remove(ArrayQueueADT adt) {
        Object result = peek(adt);
        adt.tail = adt.tail == 0 ? adt.array.length - 1 : --adt.tail;
        adt.array[adt.tail] = null;
        adt.size--;
        return result;
    }

    // Предусловие: adt != null
    // Постусловие: размер очереди возвращён
    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    // Предусловие: adt != null
    // Постусловие: возвращено true, если очередь пуста, иначе false
    public static boolean isEmpty(ArrayQueueADT adt) {
        return adt.size == 0;
    }

    // Предусловие: adt != null
    // Постусловие: очередь очищена
    public static void clear(ArrayQueueADT adt) {
        adt.size = adt.head = adt.tail = 0;
        adt.array = new Object[INITIAL_SIZE];
    }

    // Предусловие: adt != null
    // Постусловие: очередь возвращена в виде массива
    public static Object[] toArray(ArrayQueueADT adt) {
        Object[] temp = new Object[adt.size];
        int count = adt.tail < adt.head ? adt.array.length - adt.head : adt.size;
        System.arraycopy(adt.array, adt.head, temp, 0, count);
        if (adt.tail < adt.head)
            System.arraycopy(adt.array, 0, temp, count, adt.tail);
        return temp;
    }
}