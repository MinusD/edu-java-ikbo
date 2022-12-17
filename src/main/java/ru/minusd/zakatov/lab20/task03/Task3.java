package ru.minusd.zakatov.lab20.task03;

import java.io.Serializable;

public class Task3<T extends Comparable<T>, V extends Serializable, K extends Animal> {
    private T first;
    private V second;
    private K third;

    public Task3(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static void main(String[] args) {
        Task3<String, Integer, Dog> three = new Task3<>(
                "nums",
                5,
                new Dog()
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
