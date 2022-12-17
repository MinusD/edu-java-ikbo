package ru.minusd.marov.lab01.task02;

public class Main {
    public static void main(String[] args) {
        double[] harmonic = new double[10];
        for(int i = 0; i < 10; i++) {
            harmonic[i] = 1. / (i + 1);
        }

        double sum = 0;

        System.out.print("first 10 numbers in a row: ");
        for(int i = 0; i < 10; i++) {
            String result = String.format("%.3f", harmonic[i]);
            sum += harmonic[i];
            System.out.println(result);
        }

        String result = String.format("%.3f", sum);
        System.out.print("sum: ");
        System.out.println(result);

    }
}