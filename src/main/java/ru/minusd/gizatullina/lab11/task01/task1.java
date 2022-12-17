package ru.minusd.gizatullina.lab11.task01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        Calendar a = new GregorianCalendar();
        System.out.println("Developer: Gizatullina");
        System.out.println("Date of receipt of the task: " + a.getTime());
        Thread.sleep(1000);
        Date b = new Date();
        System.out.println("Task due date: " + b);
    }
}