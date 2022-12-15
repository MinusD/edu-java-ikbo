package ru.minusd.zakatov.lab20.task02;

import java.util.ArrayList;
import java.util.List;

public class Task2<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Task2(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static void main(String[] args) {
        Task2<String, Integer, List<Integer>> three = new Task2<>(
                "nums",
                5,
                new ArrayList<>()
        );

        three.printClasses();
    }

    public void printClasses() {
        System.out.println("Class of first: " + first.getClass().getName());
        System.out.println("Class of second: " + second.getClass().getName());
        System.out.println("Class of third: " + third.getClass().getName());
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
}
