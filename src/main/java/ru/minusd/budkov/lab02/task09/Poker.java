package ru.minusd.budkov.lab02.task09;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] m = {"пики", "буби", "черви", "крести"};
        String[] r = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "валет", "дама", "король", "туз"};
        int[]a = new int[52];
        for(int i = 0; i < 52; i++){
            a[i] = 0;
        }
        System.out.print("Введите количество игроков ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Игрок " + (i + 1));
            for(int j = 0; j < 5; j++){
                int k = random.nextInt(0,51);
                while(a[k] != 0){
                    k = random.nextInt(0,51);
                }
                a[k] = 1;
                System.out.print(m[k/13] + " " + r[k%13] + "  ");
            }
            System.out.println();
        }
    }
}