package ru.minusd.marov.lab02.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, n;
        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers: ");
        n = in.nextInt();
        System.out.print("input first number: ");
        a = in.nextInt();

        int[] fibonacci = new int[n + a];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n + a; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        for (int i = a; i < n + a; i++)
            System.out.println(fibonacci[i]);
    }
}