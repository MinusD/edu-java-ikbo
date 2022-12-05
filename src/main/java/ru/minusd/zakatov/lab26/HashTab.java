package ru.minusd.zakatov.lab26;

import java.util.HashMap;
import java.util.Map;

public class HashTab<T, V> {
    private Map<T, V> table;

    public void init() {
        table = new HashMap<>();
    }

    public void add(T key, V value) {
        table.put(key, value);
    }

    public V lookup(T key) {
        return table.get(key);
    }

    public void delete(T key) {
        table.remove(key);
    }
}
