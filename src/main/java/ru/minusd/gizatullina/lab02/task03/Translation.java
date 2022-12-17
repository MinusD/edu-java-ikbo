package ru.minusd.gizatullina.lab02.task03;

import java.util.Scanner;

public class Translation {
    public static String f(double N, int CC) {
        double ost = N - (int) N;
        int zn = (int) N;
        String digit = "";
        while (zn > 0) {
            if (zn % CC < 10)
                digit = zn % CC + digit;
            else
                digit = (char) ((zn % CC) + 55) + digit;
            zn = zn / CC;
        }
        digit += ".";
        for (int i = 0; i < 3; i++) {
            ost = ost * CC;

            if ((int) ost < 10)
                digit += (int) ost;
            else
                digit += (char) (((int) ost) + 55);
            ost = ost - (int) ost;

        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число, которое хотите перевести: ");
        double N = console.nextDouble();
        System.out.print("Введите систему счисления, в которую хотите перевести число: ");
        int CC = console.nextInt();

        System.out.println("При системе счисления = " + CC + " " + f(N, CC));
        System.out.println("При системе счисления = 2 " + f(N, 2));
        System.out.println("При системе счисления = 16 " + f(N, 16));
    }
}