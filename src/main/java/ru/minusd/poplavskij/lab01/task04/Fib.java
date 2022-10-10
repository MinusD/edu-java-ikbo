package ru.minusd.poplavskij.lab01.task04;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        int a = 0;
        int b = 1;
        int res;
        for (int i = 2; i < n; i++) {
            res = a + b;
            if (i > v) {
                System.out.print(res + " ");
            }
            a = b;
            b = res;
        }
    }
}
