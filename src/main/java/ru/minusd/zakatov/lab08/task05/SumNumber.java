package ru.minusd.zakatov.lab08.task05;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        System.out.println("Sum = " + sumNumber(in.nextInt()));
    }

    public static int sumNumber(int n) {
        if (n < 10) return n;
        return n % 10 + sumNumber(n / 10);
    }
}
