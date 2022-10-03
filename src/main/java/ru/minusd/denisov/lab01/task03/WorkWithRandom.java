package ru.minusd.denisov.lab01.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WorkWithRandom {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        Random random = new Random(245);
        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(-100, 100));
        }
        System.out.println("Random: " + arr);

        Collections.sort(arr);
        System.out.println("Sorted: " + arr);

        for (int i = 0; i < 10; i++) {
            arr.set(i, (int) (Math.random() * 100 - 50));
        }
        System.out.println("Math.random: " + arr);

        Collections.sort(arr);
        System.out.println("Sorted: " + arr);
    }
}
