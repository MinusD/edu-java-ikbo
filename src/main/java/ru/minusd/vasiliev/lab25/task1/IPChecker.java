package ru.minusd.vasiliev.lab25.task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPChecker {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ip = scanner.nextLine();
        var regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        System.out.println((Pattern.matches(regex, ip)) ? "IP верен" : "IP неверного формата");
    }
}
