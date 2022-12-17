package ru.minusd.gizatullina.lab14.task07;

import java.util.regex.Pattern;

public class task7 {
    public static void main(String[] args) {
        String text =  "032_assword";
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*[a-z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text));
    }
}