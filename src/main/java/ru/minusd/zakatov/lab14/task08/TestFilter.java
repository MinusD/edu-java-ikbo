package ru.minusd.zakatov.lab14.task08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Filter {
    boolean apply(Object o);
}

public class TestFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 nums: ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            nums.add(in.nextInt());
        }

        List<Integer> even = filter(nums, n -> (Integer) n % 2 == 0);

        System.out.print("Even numbers: ");
        even.forEach(n -> System.out.print(n + " "));
    }

    public static <T> List<T> filter(List<T> arr, Filter f) {
        List<T> newArr = new ArrayList<>();
        for (T obj : arr) {
            if (f.apply(obj)) {
                newArr.add(obj);
            }
        }

        return newArr;
    }
}
