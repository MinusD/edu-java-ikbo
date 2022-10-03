package ru.minusd.zakatov.lab01.task03;

public class Harmony {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double p = 1.0 / (i + 1);
            sum += p;
            System.out.printf("%.2f ", p);
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
