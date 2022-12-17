package ru.minusd.vasiliev.lab20.task04;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        T min = array[0];
        for (T t : array) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    public T max() {
        T max = array[0];
        for (T t : array) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
