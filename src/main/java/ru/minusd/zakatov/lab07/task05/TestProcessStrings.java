package ru.minusd.zakatov.lab07.task05;

import java.util.Scanner;

public class TestProcessStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        ProcessStrings str = new ProcessStrings(in.nextLine());

        System.out.println("Count of chars: " + str.count());
        System.out.println("The odd string: " + str.getOddString());
        System.out.println("Reversed string: " + str.reverse());
    }
}
