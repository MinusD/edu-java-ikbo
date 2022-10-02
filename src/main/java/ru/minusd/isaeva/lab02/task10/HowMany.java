package ru.minusd.isaeva.lab02.task10;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int count = line.length() - line.replace(" ", "").length() + 1;
        System.out.println(count);
    }
}
