package ru.minusd.bajdak.lab02.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DogKennel {
    private final List<Dog> dogs = new ArrayList<>();

    public void add(Dog... dogs) {
        this.dogs.addAll(Arrays.asList(dogs));

    }

    @Override
    public String toString() {
        return "TestDog{" +
                "dogs=" + dogs +
                '}';
    }
}