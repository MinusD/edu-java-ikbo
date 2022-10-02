package ru.minusd.denisov.lab02.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество собак: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите кличку собаки и её возраст: ");
            String name = scanner.next();
            int age = scanner.nextInt();
            dogs.add(new Dog(name, age));
        }

        for (Dog dog : dogs) {
            System.out.print(dog);
            System.out.println("\tЕё 'человеческий' возраст: " + dog.getHumanAge());
        }
    }

}
