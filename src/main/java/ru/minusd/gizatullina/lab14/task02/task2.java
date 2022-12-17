package ru.minusd.gizatullina.lab14.task02;

import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        String example = "abcdefghijklmnopqrstuv18340";
        String a = "abcdefghijklmnopqrstuv18340";
        String b = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(Pattern.matches(example, a));
        System.out.println(Pattern.matches(example, b));
    }
}