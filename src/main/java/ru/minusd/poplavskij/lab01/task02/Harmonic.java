package ru.minusd.poplavskij.lab01.task02;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        for (double i = 1; i < n; i++) {
            double temp = 1.0/i;
            sum+=temp;
        }
        System.out.printf("sum = %.2f", sum);       
    }
}
