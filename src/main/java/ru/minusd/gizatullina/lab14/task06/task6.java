package ru.minusd.gizatullina.lab14.task06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(Pattern.matches("[\\w]+@[\\w\\.]+[\\w]", text));
    }
}