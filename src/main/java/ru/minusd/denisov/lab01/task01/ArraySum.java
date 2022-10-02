package ru.minusd.denisov.lab01.task01;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i < n) {
            sum += array[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < n);
        System.out.println(sum);
    }
}
