package ru.minusd.vasiliev.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd-MM-yyyy: ");
        var dateString = scanner.next("[0-9]{2}-[0-9]{2}-[0-9]{4}");
        var dateParser = new SimpleDateFormat("dd-MM-yyyy");
        try {
            var date = dateParser.parse(dateString);
            System.out.println(date.before(new Date())
                    ? "Введённая дата раньше системного времени."
                    : "Введённая дата позже системного времени.");
        } catch (ParseException exception) {
            System.out.println("Введена неверная дата.");
        }
    }
}
