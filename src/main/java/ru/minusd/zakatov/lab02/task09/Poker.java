package ru.minusd.zakatov.lab02.task09;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> suits = List.of("черви", "бубны", "пики", "трефы");
        List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз");
        List<String> cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(rank + " " + suit);
            }
        }
        Collections.shuffle(cards);

        System.out.print("Введите число игроков: ");
        int countOfCards = cards.size();
        int n = in.nextInt();
        int cardsPerPlayer = countOfCards / n;

        for (int i = 0; i < n; i++) {
            System.out.print("Карты игрока " + (i + 1) + ": ");

            for (int j = i; j < i + cardsPerPlayer; j++) {
                System.out.print(cards.get(j) + ", ");
            }
            System.out.println();
        }
    }
}
