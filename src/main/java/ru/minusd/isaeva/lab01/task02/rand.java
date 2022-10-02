package ru.minusd.isaeva.lab01.task02;

import java.util.Random;

public class rand {
    public static void main(String[] args) {

        int count = 10;
        int[] mas = new int[count];

        int i = 0;
        while (i < count) {
            mas[i] = (int) (Math.random()*100);
            i++;
        }

        for (i = 0; i < 10; i++) {
            System.out.print(mas[i]+" ");
        }

        System.out.println();
        java.util.Arrays.sort(mas);

        for (i = 0; i < 10; i++) {
            System.out.print(mas[i]+" ");
        }

        System.out.println();

        Random rnd = new Random();
        i = 0;
        while (i < count) {
            mas[i] = rnd.nextInt(10);
            i++;
        }

        for (i = 0; i < 10; i++) {
            System.out.print(mas[i]+" ");
        }

        System.out.println();
        java.util.Arrays.sort(mas);

        for (i = 0; i < 10; i++) {
            System.out.print(mas[i]+" ");
        }

    }
}
