package ru.minusd.zakatov.lab11.task02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCompareDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar today = new GregorianCalendar();

        System.out.print("Enter date in format (YYYY-MM-DD): ");
        String[] date = in.next().split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        Calendar userDate = new GregorianCalendar();
        userDate.set(year, month - 1, day);

        System.out.println("Your date: " + userDate.getTime());
        System.out.println("Today: " + today.getTime());

        if (today.compareTo(userDate) > 0) {
            System.out.println("Before");
        } else {
            System.out.println("After");
        }
    }
}
