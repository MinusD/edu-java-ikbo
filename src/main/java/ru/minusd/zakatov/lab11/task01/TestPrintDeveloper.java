package ru.minusd.zakatov.lab11.task01;

import java.util.Date;
import java.util.Scanner;

public class TestPrintDeveloper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zakatov");
        System.out.print("Enter datetime of getting task (YYYY-MM-DD hh:mm:ss): ");
        String[] date = in.next().split("-");
        String[] time = in.next().split(":");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        Date gettingDate = new Date(year, month - 1, day, hour, minute, second);

        System.out.println("Getting task: " + gettingDate);
        System.out.println("Handing in task: " + new Date());
    }
}
