package ru.minusd.vasiliev.lab03.task5;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var doghouse = new DogHouse();
        var count = scanner.nextInt();
        for (int i = 0; i < count; i++){
            System.out.print("Введите кличку " + (i+1) + "-ой собаки: ");
            var name = scanner.next();
            System.out.print("Введите её возраст: ");
            var age = scanner.nextInt();
            doghouse.addDogs(new Dog(name, age), new Dog(name, age));
        }
        for (Dog dog: doghouse.getDogs()) {
            System.out.println(dog.getName() + ' ' + dog.getHumanAge());
        }
    }
}
