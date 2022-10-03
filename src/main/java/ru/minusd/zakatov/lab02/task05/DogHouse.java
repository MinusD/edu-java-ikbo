package ru.minusd.zakatov.lab02.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();


        System.out.print("Введите имя и возраст: ");
        String name = in.next();
        int age;

        while (!name.equals("END")) {
            age = in.nextInt();
            dogs.add(new Dog(name, age));
            System.out.print("Введите имя и возраст: ");
            name = in.next();
        }

        System.out.println("Приемник: ");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
