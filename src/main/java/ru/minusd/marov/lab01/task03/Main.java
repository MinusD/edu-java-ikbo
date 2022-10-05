package ru.minusd.marov.lab01.task03;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input amount of numbers in array: ");
        int n = in.nextInt();

        int[] array = new int[n];
        int[] array1 = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array1);
        Arrays.sort(array);
        System.out.println("1st array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("2nd array: ");
        System.out.println(Arrays.toString(array1));

        in.close();
    }
}