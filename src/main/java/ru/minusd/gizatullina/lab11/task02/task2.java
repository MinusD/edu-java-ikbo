package ru.minusd.gizatullina.lab11.task02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Calendar input = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        input.set(Calendar.YEAR, in.nextInt());
        System.out.print("Enter month: ");
        input.set(Calendar.MONTH, in.nextInt());
        System.out.print("Enter day of month: ");
        input.set(Calendar.DAY_OF_MONTH, in.nextInt());
        System.out.print("Enter hour: ");
        input.set(Calendar.HOUR_OF_DAY, in.nextInt());
        System.out.print("Enter minutes: ");
        input.set(Calendar.MINUTE, in.nextInt());
        System.out.print("Enter seconds: ");
        input.set(Calendar.SECOND, in.nextInt());
        Calendar now = new GregorianCalendar();
        System.out.println("System time larger than entered time: " + now.after(input));
    }
}