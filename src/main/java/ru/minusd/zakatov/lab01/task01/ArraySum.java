package ru.minusd.zakatov.lab01.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("Size: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " -> ");
            nums.add(in.nextInt());
        }

        int sum = 0;
        int i = 0;

        // For loop
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum = " + sum);

        // While loop
        sum = 0;
        while (i < n) {
            sum += nums.get(i++);
        }
        System.out.println("Sum = " + sum);

        // Do while loop
        sum = 0;
        i = 0;
        do {
            if (i < n) {
                sum += nums.get(i++);
            }
        } while (i < n);

        System.out.println("Sum = " + sum);
    }
}
