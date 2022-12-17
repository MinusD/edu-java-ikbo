package ru.minusd.denisov.lab02.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static final String[] cardRanks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static final int cardsPerPlayer = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        assert n * cardsPerPlayer <= 52;

        ArrayList<String> deck = new ArrayList<>(4 * cardRanks.length);  // 52-карточная колода
        for (String cardSuit : "♠♥♦♣".split("")) {
            for (String cardRank : cardRanks) {
                deck.add(cardRank + cardSuit);
            }
        }
        Collections.shuffle(deck);

        String[][] hands = new String[n][cardsPerPlayer];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                hands[i][j] = deck.remove(0);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ": " + Arrays.toString(hands[i]));
        }
    }
}
