package ru.minusd.vasiliev.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var year = scanner.nextInt();
        var month = scanner.nextInt();
        var day = scanner.nextInt();
        var hours = scanner.nextInt();
        var minutes = scanner.nextInt();
        try {
            Date date = new SimpleDateFormat("yyyy MM dd hh mm")
                    .parse(String.format("%d %d %d %d %d", year, month, day, hours, minutes));
            Calendar calendar = new GregorianCalendar();
            calendar.set(year, month, day, hours, minutes);
            System.out.println(date);
            System.out.println(calendar);
        } catch (ParseException exception) {
            System.out.println("Введена неверная дата.");
        }
    }
}
