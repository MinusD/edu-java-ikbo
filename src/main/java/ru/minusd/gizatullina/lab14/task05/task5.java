package ru.minusd.gizatullina.lab14.task05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(Pattern.matches("([0-2][0-9]/[01][0-9]/[2-9][0-9][0-9][0-9])|" +
                "([0-2][0-9]/[01][0-9]/19[0-9][0-9])|(3[01]/[01][0-9&&[^2]]/[2-9][0-9][0-9][0-9])|" +
                "(3[01]/[01][0-9&&[^2]]/19[0-9][0-9])", text));
    }
}