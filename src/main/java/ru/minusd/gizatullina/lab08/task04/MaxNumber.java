package ru.minusd.gizatullina.lab08.task04;

import java.util.Scanner;

public class MaxNumber {
    public static int func(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, func());
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = in.nextInt();
        System.out.println(func());
    }
}
