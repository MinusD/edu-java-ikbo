package ru.minusd.kuznetsov.lab03.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Poker {
    private static ArrayList<ArrayList<String>> players = new ArrayList<>();
    private static String[] cards = new String[32];

    public static void main(String[] args) {
        for (int i = 0; i < 32; i++)
            cards[i] = Integer.toString(i+1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of poker players: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<String> s = new ArrayList<>();
            players.add(s);
        }

        int index = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < n; j++)
                players.get(j).add(cards[++index]); //cards[index++]

        System.out.println(Arrays.deepToString(players.toArray()));
    }
}
