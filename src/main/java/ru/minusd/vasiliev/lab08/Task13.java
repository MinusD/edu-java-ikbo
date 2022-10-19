package ru.minusd.vasiliev.lab08;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        outOddIndices();
    }

    private static void outOddIndices() {
        var scanner = new Scanner(System.in);
        var num1 = scanner.nextInt();
        if (num1 != 0) System.out.println(num1);
        var num2 = scanner.nextInt();
        if (num1 == 0 || num2 == 0) return;
        outOddIndices();
    }
}
