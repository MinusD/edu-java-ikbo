package ru.minusd.gizatullina.lab25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[()]");
        Matcher matcher = pattern.matcher(text);
        int c = 0;
        while (matcher.find()) {
            String character = matcher.group();
            if (character.equals("(")) {
                c++;
            } else {
                c--;
            }
            if (c < 0) {
                System.out.println("Выражение неверное");
                return;
            }
        }
        if (c == 0) {
            System.out.println("Выражение верное");
        } else {
            System.out.println("Выражение неверное");
        }
    }
}