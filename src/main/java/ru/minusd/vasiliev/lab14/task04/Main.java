package ru.minusd.vasiliev.lab14.task04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        var str = scanner.nextLine();
        var pattern = Pattern.compile("[0-9] \\+");
        var matcher = pattern.matcher(str);
        System.out.println(matcher.find() ? "Выражение содержит сложение" : "Выражение не содержит сложение");
    }
}
