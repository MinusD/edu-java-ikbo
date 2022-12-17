package ru.minusd.gizatullina.lab14.task04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String a = "(1 + 8) – 9 / 4";
        String b = "6 / 5 – 2 * 9";
        Pattern pattern = Pattern.compile("\\d\\s*\\+");
        Matcher matcher1 = pattern.matcher(a);
        Matcher matcher2 = pattern.matcher(b);
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
    }
}