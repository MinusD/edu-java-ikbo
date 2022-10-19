package ru.minusd.vasiliev.lab13.task05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        var phone = scanner.nextLine();
        System.out.println(PhoneFormat.format(phone));
    }
}
