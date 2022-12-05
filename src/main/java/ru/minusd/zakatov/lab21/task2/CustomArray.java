package ru.minusd.zakatov.lab21.task2;

import java.util.ArrayList;
import java.util.List;

public class CustomArray {
    List<Object> arr;

    public CustomArray() {
        arr = new ArrayList<>();
    }

    public void add(Object item) {
        arr.add(item);
    }

    public Object get(int index) {
        return arr.get(index);
    }

    public int size() {
        return arr.size();
    }
}
