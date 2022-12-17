package ru.minusd.vasiliev.lab08;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        outOdds();
    }

    private static void outOdds() {
        var scanner = new Scanner(System.in);
        var num = scanner.nextInt();
        if (num == 0) return;
        if (num % 2 == 1) System.out.println(num);
        outOdds();
    }
}
