package ru.minusd.gizatullina.lab14.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
