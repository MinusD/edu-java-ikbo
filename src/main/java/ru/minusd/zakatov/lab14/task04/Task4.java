package ru.minusd.zakatov.lab14.task04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String str = "(1 - 3) - 1 * 3";
        String regex = ".*\\+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.matches()) {
            System.out.println("В строке есть плюс");
        } else {
            System.out.println("В строке нет плюса");
        }
    }
}
