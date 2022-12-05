package ru.minusd.zakatov.lab21.task5;

import java.util.*;

public class Solution<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Solution(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <T> List<T> newArrayList(T... items) {
        return new ArrayList<T>(Arrays.stream(items).toList());
    }

    public static <T> Set<T> newHashSet(T... items) {
        return new HashSet<>(Arrays.stream(items).toList());
    }

    public static <K, V> Map<K, V> newHashMap(Map.Entry<K, V>... entries) {
        Map<K, V> map = new HashMap<>();

        for (var entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }

        return map;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
