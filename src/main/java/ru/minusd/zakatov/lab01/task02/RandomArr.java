package ru.minusd.zakatov.lab01.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArr {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            nums.add(random.nextInt() % 100);
        }
        System.out.println("java.util.Random: ");
        System.out.println("Initial array: " + nums);
        sort(nums);
        System.out.println("Sorted array: " + nums + "\n");

        nums.clear();

        for (int i = 0; i < n; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println("Math.random: ");
        System.out.println("Initial array: " + nums);
        sort(nums);
        System.out.println("Sorted array: " + nums + "\n");
    }

    private static void sort(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) > nums.get(j)) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
    }
}
