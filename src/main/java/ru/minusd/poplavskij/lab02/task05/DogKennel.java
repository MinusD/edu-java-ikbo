package ru.minusd.poplavskij.lab02.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    ArrayList<Dog> list_dogs = new ArrayList<Dog>(0);

    public void addDogs() {
        String name;
        int age, count_dogs;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите количество собак: ");
        count_dogs = scanner.nextInt();

        System.out.println("¬ведите им€ и возраст собаки: ");
        for (int i = 0; i < count_dogs; i++) {
            name = scanner.next();
            age = scanner.nextInt();
            list_dogs.add(new Dog(name, age));
        }
    }

    public void showDogs() {
        for (Dog dog : list_dogs) {
            System.out.println(dog.toString());
        }
    }
}
