package ru.minusd.vasiliev.lab14.task05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateCheck {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        var input = scanner.nextLine();
        System.out.println(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", input)
                ? "Дата в формате dd/mm/yyyy"
                : "Дата не в формате dd/mm/yyyy");
    }
}
