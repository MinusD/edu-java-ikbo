package ru.minusd.zakatov.lab14.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = in.nextLine();

        System.out.print("Enter regular expression: ");
        String regex = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> split = new ArrayList<>();

        if (matcher.find()) {
            int start = 0;
            int end = matcher.start();
            int previousEnd = matcher.end();
            if (end - start != 0)
                split.add(input.substring(start, end));

            while (matcher.find()) {
                start = previousEnd;
                end = matcher.start();
                previousEnd = matcher.end();
                split.add(input.substring(start, end));
            }

            if (previousEnd != input.length())
                split.add(input.substring(previousEnd));
        }

        System.out.println("Split string: ");
        for (String s : split) {
            System.out.println("> " + s);
        }
    }
}
