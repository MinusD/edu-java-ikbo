package ru.minusd.zakatov.lab08.task03;

import java.util.Scanner;

public class PrintAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A and B: ");
        printSequence(in.nextInt(), in.nextInt());
    }

    public static void printSequence(int A, int B) {
        if (A == B) {
            System.out.print(A + " ");
            return;
        }

        System.out.print(A + " ");
        if (A < B) {
            printSequence(A + 1, B);
        } else {
            printSequence(A - 1, B);
        }
    }
}
