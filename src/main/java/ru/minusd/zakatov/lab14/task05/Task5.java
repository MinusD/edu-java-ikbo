package ru.minusd.zakatov.lab14.task05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter data in format dd/mm/yyyy: ");
        String input = in.nextLine();
        String regex = "(?<day>0[0-9]|[12][0-9]|3[01])/(?<month>0[1-9]|1[012])/(?<year>(?:19|[2-9][0-9])[0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean isCorrect = true;

        if (matcher.find()) {
            int day = Integer.parseInt(matcher.group("day"));
            int month = Integer.parseInt(matcher.group("month"));
            int year = Integer.parseInt(matcher.group("year"));

            if ((month == 4 || month == 7 || month == 9 || month == 11) && day == 31)
                isCorrect = false;

            if (month == 2 && day > 29)
                isCorrect = false;

            if (month == 2 && day == 29 && year % 4 != 0)
                isCorrect = false;
        } else {
            isCorrect = false;
        }

        System.out.println(isCorrect ? "The date is correct" : "The is not correct");
    }
}
