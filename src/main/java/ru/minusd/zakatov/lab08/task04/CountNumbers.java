package ru.minusd.zakatov.lab08.task04;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter k and d: ");
        int k = in.nextInt();
        int d = in.nextInt();

        System.out.println(countNumbers(k, d));
    }

    public static int countNumbers(int k, int d) {
        if (k == 1) {
            return (0 < d && d < 10) ? 1 : 0;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            count += countNumbers(k - 1, d - i);
        }

        return count;
    }
}
