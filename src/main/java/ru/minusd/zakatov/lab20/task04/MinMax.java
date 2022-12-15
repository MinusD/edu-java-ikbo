package ru.minusd.zakatov.lab20.task04;

import java.util.List;

public class MinMax<T extends Comparable<T>> {
    private final List<T> array;

    public MinMax(List<T> array) {
        this.array = array;
    }

    public T min() {
        T m = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (m.compareTo(array.get(i)) > 0) {
                m = array.get(i);
            }
        }

        return m;
    }

    public T max() {
        T m = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (m.compareTo(array.get(i)) < 0) {
                m = array.get(i);
            }
        }

        return m;
    }
}
