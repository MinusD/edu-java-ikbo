package ru.minusd.marov.lab01.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers in array: ");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.print("input numbers in array: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += array[i];
        }

        int j = n;
        do {
            j--;
            sum2 += array[j];
        }
        while (j > 0);

        int k = 0;
        while (k < n) {
            sum3 += array[k];
            k++;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        in.close();
    }
}