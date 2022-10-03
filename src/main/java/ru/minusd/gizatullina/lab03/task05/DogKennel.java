package ru.minusd.gizatullina.lab03.task05;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private final List<Dog> dogs = new ArrayList<>();

    public void add(Dog dog) {
        dogs.add(dog);
    }

    @Override
    public String toString() {
        return "TestDog{" +
                "dogs=" + dogs +
                '}';
    }
}
