package ru.minusd.kuznetsov.lab03.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 5);
        Dog dog2 = new Dog("Barsik", 3);
        Dog dog3 = new Dog("Shanti", 7);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        int flag = 1;
        String dog_name;
        int dog_age;
        Dog dog;
        while (flag!=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What to do?\n" +
                    "1 - Print all dogs in database\n" +
                    "2 - Add a new dog\n" +
                    "3 - Delete the dog by name\n" +
                    "4 - Print 'Human' age of the dog by name\n" +
                    "0 - Exit" +
                    "Enter: ");
            flag = scanner.nextInt();
            switch (flag) {
                case 1:
                    for (Dog dogg :
                            dogs) {
                        System.out.println(dogg);
                    }
                    break;
                case 2:
                    System.out.print("Enter a name of the dog: ");
                    dog_name = scanner.next();
                    System.out.print("Enter an age of the dog: ");
                    dog_age = scanner.nextInt();
                    dog = new Dog(dog_name,dog_age);
                    dogs.add(dog);
                    break;
                case 3:
                    System.out.print("Enter a name of the dog: ");
                    dog_name = scanner.next();
                    for (Dog dogg: dogs) {
                        if (dogg.getName().equals(dog_name)) {
                            dogs.remove(dogg);
                            System.out.println("Dog was completely deleted from database");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter a name of the dog: ");
                    dog_name = scanner.next();
                    for (Dog dogg: dogs) {
                        if (dogg.getName().equals(dog_name)) {
                            System.out.println("'Human' dog's age is " + dogg.getAgeInHuman() + " years old");
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }


    }
}
