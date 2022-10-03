package ru.minusd.zakatov.lab02.task09;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число игроков: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Карты игрока " + (i + 1) + ": ");

            for (int j = 0; j < 5; j++) {
                System.out.print(new Random().nextInt() % 100 + " ");
            }
            System.out.println();
        }
    }
}
