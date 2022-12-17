package ru.minusd.gizatullina.lab08.task01;

import java.util.Scanner;

public class NumberOutput {
    public static void func(int x) {
        if (x / 10 != 0)
            func(x / 10);
        System.out.println(x % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();
        func(n);
    }
}

