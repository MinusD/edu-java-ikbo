package ru.minusd.marov.lab02.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static String int_to_ns(int ns, int number) {
        String ans = "";
        do {
            ans = Character.toString(((number % ns) >= 10) ? (char) (55 + (number % ns)) : (char) (48 + (number % ns))) + ans;
            number /= ns;
        } while(number > 0);
        return ans;
    }
    public static String double_to_ns(int ns, double number) {
        String ans = "";
        double M = 1. / Math.pow(10, (Double.toString(number).length() - 2));
        double n = -Math.log(M) / Math.log(ns);
        for(int i = 0; i < (int) n; i++){
            number *= ns;
            ans += Character.toString(((int) number >= 10) ? (char) (55 + (int) number) : (char) (48 + (int) number));
            number %= 1;
        }

        while(ans.endsWith("0"))
            ans = ans.substring(0, ans.length() - 1);
        return "," + ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input number in decimal n. s.: ");
        double n = in.nextDouble();
        System.out.print("input n. s. to convert to: ");
        int ns = in.nextInt();

        System.out.print("number in " + ns + " n. s.: ");
        System.out.println(int_to_ns(ns, (int) n) + double_to_ns(ns, n % 1));

        System.out.print("number in 2 n. s.: ");
        System.out.println(int_to_ns(2, (int) n) + double_to_ns(2, n % 1));

        System.out.print("number in 16 n. s.: ");
        System.out.println(int_to_ns(16, (int) n) + double_to_ns(16, n % 1));


    }
}