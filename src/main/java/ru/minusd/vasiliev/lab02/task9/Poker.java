package ru.minusd.vasiliev.lab02.task9;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class Poker {
    private static String[] cardTypes = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static String[] cardSuits = {"Diamonds", "Hearts", "Clubs", "Spades"};
    private static HashSet<String> dealedCards = new HashSet<>();

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var rand = new Random();
        var count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String cardHand = "";
            for (int j = 0; j < 5; j++) {
                while (true) {
                    String card = cardTypes[rand.nextInt(cardTypes.length)] + '-' + cardSuits[rand.nextInt(cardSuits.length)];
                    if (!dealedCards.contains(card)) {
                        dealedCards.add(card);
                        cardHand += (card + ' ');
                        break;
                    }
                }
            }
            System.out.println(cardHand);
            System.out.println();
        }
    }
}
