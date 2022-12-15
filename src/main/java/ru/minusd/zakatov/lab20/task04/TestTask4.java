package ru.minusd.zakatov.lab20.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTask4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 100);
            System.out.print(n + " ");
            nums.add(n);
        }
        System.out.println();

        MinMax<Integer> minMax = new MinMax<>(nums);
        System.out.println("Max: " + minMax.max());
        System.out.println("Min: " + minMax.min());

        Scanner in = new Scanner(System.in);
        System.out.print("Enter double: ");
        double d = in.nextDouble();

        System.out.println("Sum with max: " + Calculator.sum(minMax.max(), d));
        System.out.println("Multiply with min: " + Calculator.multiply(minMax.min(), d));
    }
}
