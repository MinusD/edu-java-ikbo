package ru.minusd.vasiliev.lab14.task07;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        var input = scanner.nextLine();
        System.out.println(Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}", input)
                ? "Пароль надёжен"
                : "Пароль ненадёжен");
    }
}
