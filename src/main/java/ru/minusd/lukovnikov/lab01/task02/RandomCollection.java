package ru.minusd.lukovnikov.lab01.task02;

import java.util.Arrays;
import java.util.Random;

public class RandomCollection {
    public static void main(String[] args) {
        int[] data = new int[10];

        // Use Math.Random()
        System.out.println("\nUse Math.Random()");
        for (int i = 0; i < 10; i++) {
            data[i] = (int) Math.round(Math.random() * 10000);
        }
        show(data);
        Arrays.sort(data);
        show(data);

        // Use Random.nextInt()
        System.out.println("\nUse Random.nextInt()");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            data[i] = random.nextInt();
        }
        show(data);
        Arrays.sort(data);
        show(data);
    }

    public static void show(int[] data) {
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}