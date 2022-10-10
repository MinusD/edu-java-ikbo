package ru.minusd.marov.lab03.task10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("enter some text");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringTokenizer ins = new StringTokenizer(string);
        int cnt = 0;
        while (ins.hasMoreTokens()){
            cnt++;
            ins.nextToken();
        }
        System.out.println("amount of words in ur text: " + cnt);

    }
}
