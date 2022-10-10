package ru.minusd.poplavskij.lab01.task06;//получает 2 числа
//1 само число double
//2 в какую сс надо перевести
//+ перевести в 2ичную и в 16ичную

import java.util.Scanner;

public class SS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        script(a, n);
        script(a, 2);
        script(a, 16);
    }

    public static void script(double a, int n) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int left = (int) a;
        double right = a - left;
        String ans = "";
        while (left != 0) {
            int temp = left % n;
            String add = "";
            if (temp > 9) {
                char let = alph.charAt(temp - 10);
                add = add + let;
            } else {
                add = Integer.toString(temp);
            }

            ans = add + ans;
            left = left / n;
        }
        ans = ans + ",";
        for (int i = 0; i < 3; i++) {
            int temp = (int) (right * n);
            String add = "";
            if (temp > 9) {
                char let = alph.charAt(temp - 10);
                add = add + let;
            } else {
                add = Integer.toString(temp);
            }
            ans = ans + add;
            right = right * n - temp;
        }
        System.out.println(ans);
    }
}
