package ru.minusd.vasiliev.lab14.task01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите обрабатываемую строку: ");
        var str = scanner.nextLine();
        System.out.print("Введите регулярное выражение: ");
        var regexStr = scanner.nextLine();
        var pattern = Pattern.compile(regexStr);
        for (var part : pattern.split(str)) {
            System.out.println(part);
        }
    }
}
