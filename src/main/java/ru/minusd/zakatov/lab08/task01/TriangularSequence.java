package ru.minusd.zakatov.lab08.task01;

import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        printSequence(n);
    }

    public static void printSequence(int n) {
        if (n == 1) {
            System.out.print("1 ");
            return;
        }

        printSequence(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
    }
}
