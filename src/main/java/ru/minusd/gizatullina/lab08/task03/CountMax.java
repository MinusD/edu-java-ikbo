package ru.minusd.gizatullina.lab08.task03;

import java.util.Scanner;

public class CountMax {
    public static void func(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) {
            if (n > max) {
                func(n, 1);
            }
            else if (n == max) {
                func(max, ++count);
            }
            else {
                func(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        func(0,n);
    }
}
