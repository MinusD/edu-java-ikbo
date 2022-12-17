package ru.minusd.vasiliev.lab14.task06;

import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите email: ");
        var input = scanner.nextLine();
        System.out.println(input.matches("[a-zA-Z0-9._%+-]+@(([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})|localhost)")
                ? "Email верный"
                : "Email неверный");
    }
}
