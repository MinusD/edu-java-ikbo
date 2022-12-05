package ru.minusd.zakatov.lab14.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2  {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Правильное выражение");
        } else {
            System.out.println("Неправильное выражение");
        }
    }
}
