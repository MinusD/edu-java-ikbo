package ru.minusd.zakatov.lab11.task03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestStudent {
    public static void main(String[] args) {
        Calendar birthDay = new GregorianCalendar();
        birthDay.setTime(new Date());
        Student student = new Student("Igor Zakatov", birthDay, 100);

        System.out.println("Small time: " + student.toString('s'));
        System.out.println("Medium time: " + student.toString('m'));
        System.out.println("Long time: " + student.toString('l'));
    }
}
