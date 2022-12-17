package ru.minusd.zakatov.lab14.task03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    public static void main(String[] args) {
        String input = " 21 USD, 43 RUB, 1.15 ERU";
        String regex = "( (?:0|[1-9][0-9]*)(?:\\.[0-9][0-9]?)? (?:USD|RUB|EU))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean hasGroup = false;
        System.out.println("Prices:");
        while (matcher.find()) {
            hasGroup = true;
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.println(matcher.group(i).trim());
            }
        }

        if (!hasGroup) System.out.println("No prices");
    }
}
