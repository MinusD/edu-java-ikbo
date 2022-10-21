package ru.minusd.zakatov.lab11.task04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class InputDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String[] date = in.next().split("-");

        System.out.print("Enter time (hh:mm): ");
        String[] time = in.next().split(":");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        Date userDate = new Date(year, month - 1, day, hour, minute);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(userDate);

        System.out.println("Your date: " + userDate);
        System.out.println("Calendar: " + calendar);
    }
}
