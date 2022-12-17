package ru.minusd.vasiliev.lab14.task02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        var str = scanner.nextLine();
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", str)
                ? "Строка совпадает" : "Строка не совпадает");
    }
}
