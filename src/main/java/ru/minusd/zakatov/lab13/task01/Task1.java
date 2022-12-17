package ru.minusd.zakatov.lab13.task01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        processString(in.nextLine());

        String s = "I like Java!!!";
        System.out.println("\nProcess string: '" + s + "'");
        System.out.println("Position 'Java': " + s.indexOf("Java"));
        System.out.println("Replace 'a' to 'o': " + s.replace('a', 'o'));
        System.out.println("Upper case: " + s.toUpperCase());
        System.out.println("Lower case: " + s.toLowerCase());
        System.out.println("Substring 'Java': " + s.substring(s.indexOf("Java"), s.indexOf("Java") + 4));
    }

    public static void processString(String str) {
        System.out.println("The last char: " + str.charAt(str.length() - 1));
        System.out.println("Ends with '!!!': " + str.endsWith("!!!"));
        System.out.println("Starts with 'I like': " + str.startsWith("I like"));
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}
