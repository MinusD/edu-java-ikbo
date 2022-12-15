package ru.minusd.zakatov.lab13.task05;

import java.util.Scanner;

public class TestPhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String pn = in.nextLine();

        System.out.println("Formatted number: " + new PhoneNumber(pn));
    }
}
