package ru.minusd.zakatov.lab11.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MeasureTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter type of list (1 - ArrayList, 2 - LinkedList): ");
        int typeOfList = in.nextInt();

        List<Integer> list = typeOfList == 1 ? new ArrayList<>() : new LinkedList<>();

        System.out.println("Filling list of ten million numbers...");
        long time = measureTime(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                list.add(i);
            }
        });
        System.out.println("Time of filling: " + time + "ms");
        System.out.println("Deleting of 500 000 th item, time: " + measureTime(() -> {
            list.remove(500_000);
        }) + "ms");

        System.out.println("Adding -1 in 700 000 th place, time: " + measureTime(() -> {
            list.add(700_000, -1);
        }) + "ms");

        System.out.println("Search -1, time: " + measureTime(() -> {
            list.indexOf(-1);
        }) + "ms");
    }

    public static long measureTime(Runnable f) {
        long start = System.currentTimeMillis();
        f.run();
        return System.currentTimeMillis() - start;
    }
}
