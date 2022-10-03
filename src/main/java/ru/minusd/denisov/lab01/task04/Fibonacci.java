package ru.minusd.denisov.lab01.task04;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int start = scanner.nextInt();

        int previous = 0;
        int current = 1;
        int next = current;

        if (start == 1) {
            System.out.println(previous);
        }

        for (int i = 2; i < start + length; i++) {
            if (i >= start) {
                System.out.println(current);
            }
            next = previous + current;
            previous = current;
            current = next;
        }
    }
}
