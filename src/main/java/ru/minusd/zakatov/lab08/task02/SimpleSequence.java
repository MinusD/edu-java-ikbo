package ru.minusd.zakatov.lab08.task02;

import java.util.Scanner;

public class SimpleSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        printSequence(n);
    }

    public static void printSequence(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printSequence(n - 1);
        System.out.print(n + " ");
    }
}
