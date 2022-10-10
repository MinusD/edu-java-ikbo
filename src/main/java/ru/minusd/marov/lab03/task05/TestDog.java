package ru.minusd.marov.lab03.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        ArrayList<Dog> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        System.out.println("Enter the amount of dogs");
        quantity = sc.nextInt();
        sc.nextLine();
        String currentNickname;
        int currentAge;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the dog's nickname");
            currentNickname = sc.nextLine();
            System.out.println("Enter the dog's age");
            currentAge = sc.nextInt();
            sc.nextLine();
            arr.add(i, new Dog(currentNickname, currentAge));
            if (i == quantity){System.out.println("all dogs in the kennel"); break; } else { System.out.println("\nNext dog in the kennel:\n"); }
        }
        System.out.println(arr.get(1));
    }

}
