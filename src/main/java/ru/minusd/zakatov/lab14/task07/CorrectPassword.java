package ru.minusd.zakatov.lab14.task07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = in.nextLine();
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.matches());
    }
}
