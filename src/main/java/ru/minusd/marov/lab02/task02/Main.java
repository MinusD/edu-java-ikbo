package ru.minusd.marov.lab02.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers: ");
        n = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
            numbers.add((int) (Math.random() * 100));

        System.out.println("amount of numbers in array: " + n);
        System.out.print("array: ");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();
        System.out.print("input number to delete: ");
        int to_delete1 = in.nextInt();

        numbers.removeAll(Collections.singleton(to_delete1));

        System.out.println("number " + to_delete1 + " deleted");
        System.out.println("amount of numbers in array: " + numbers.size());
        System.out.print("array: ");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();
        System.out.print("input last digit to delete: ");
        int to_delete2 = in.nextInt();

        numbers.removeIf(x -> (x % 10 == to_delete2) || x % 100 == to_delete2);

        System.out.println("numbers ending with " + to_delete2 + " digit deleted");
        System.out.println("amount of numbers in array: " + numbers.size());
        System.out.print("array: ");
        for (int number : numbers)
            System.out.print(number + " ");
    }
}