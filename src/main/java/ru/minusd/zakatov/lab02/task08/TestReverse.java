package ru.minusd.zakatov.lab02.task08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите числа: ");

        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(n - i - 1));
            nums.set(n - i - 1, temp);
        }

        System.out.println(nums);
    }
}
