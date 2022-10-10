package ru.minusd.kuznetsov.lab03.task10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringTokenizer ins = new StringTokenizer(string);
        int count = 0;
        while (ins.hasMoreTokens()){
            count++;
            ins.nextToken();
        }
        System.out.println("Amount of words: " + count);

    }
}