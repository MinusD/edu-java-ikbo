package ru.minusd.vasiliev.lab14.task03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Prices {
    public static void main(String[] args) {
        var pattern = Pattern.compile("[1-9]+[0-9]+\\.?[0-9]{0,2} (EU|RUB|USD)");
        var scanner = new Scanner(System.in);
        System.out.print("Введите цены: ");
        var str = scanner.nextLine();
        var matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
