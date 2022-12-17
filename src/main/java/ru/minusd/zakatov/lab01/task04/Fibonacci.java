package ru.minusd.zakatov.lab01.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int start, count;
        Scanner in = new Scanner(System.in);
        System.out.print("Start: ");
        start = in.nextInt();
        System.out.print("Count: ");
        count = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);

        for (int i = 2; i < start + count; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        System.out.println(arr.subList(start, start + count));
    }
}
