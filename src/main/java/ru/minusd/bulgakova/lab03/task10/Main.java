package ru.minusd.bulgakova.lab03.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input words");
        Scanner console =new Scanner(System.in);
        String line = console.nextLine();
        line = line.trim().replaceAll("\\s+", " ");
        int count = line.length() - line.replace(" ", "").length() + 1;
        System.out.println("You write "+ count +" words.");
    }
}
