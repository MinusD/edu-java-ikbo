package ru.minusd.bulgakova.lab03.task09;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static char symbol(int n){
        switch ((int) (n/13)){
            case 0:
                return '♥';
            case 1:
                return '♣';
            case 2:
                return '♦';
            case 3:
                return '♠';

        }
        return ' ';
    }
    public static String number(int n){
        if (((n%13) < 10)&&((n%13)>0)){
            return Integer.toString((n%13)+1);
        }
        switch (n%13){
            case 0:
                return "T";
            case 10:
                return "J";
            case 11:
                return "Q";
            case 12:
                return "K";
        }
        return " ";
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] deck = new int[52];
        Arrays.fill(deck,0);
        System.out.print("Enter the number of players: ");
        int number = console.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Cards of " +(i+1)+" player: ");
            for (int j=0; j<5; j++){
                int k = (int)(Math.random()*52);
                while (deck[k]!=0){
                    k = (int)(Math.random()*52);
                }
                deck[k]=1;
                System.out.print(symbol(k)+number(k)+" ");
            }
            System.out.println();
        }
    }
}

