package ru.minusd.lukovnikov.lab01.task01;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Array size
        int[] data = new int[n];
        int sum = 0;
        int i;
        // Input array
        for (i = 0; i < n; ++i) {
            data[i] = scanner.nextInt();
        }
        // Cycle for
        for (i = 0; i < n; ++i) {
            sum += data[i];
        }
        System.out.println(sum);

        // Cycle While
        sum = 0;
        for (i = 0; i < n; ++i) {
            sum += data[i];
        }
        System.out.println(sum);

        // Cycle do-while
        i = 0;
        sum = 0;
        do {
            sum += data[i];
            ++i;
        } while (i < n);
        System.out.println(sum);
    }
}