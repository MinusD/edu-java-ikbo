package ru.minusd.gizatullina.lab14.task01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] arr = pattern.split(str);
        System.out.println(Arrays.toString(arr));
    }
}