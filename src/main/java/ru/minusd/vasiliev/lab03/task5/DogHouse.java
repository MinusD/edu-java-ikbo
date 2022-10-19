package ru.minusd.vasiliev.lab03.task5;

import java.util.ArrayList;

public class DogHouse {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void addDogs(Dog ... dogs) {
        for (Dog dog : dogs) {
            this.dogs.add(dog);
        }
    }
}
