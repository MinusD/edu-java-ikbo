package ru.minusd.zakatov.lab18.task03;

import java.util.Scanner;

public class Exception3 {
    static public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    static public void exceptionDemoTryCatch() {
        try {
            exceptionDemo();
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        exceptionDemoTryCatch();
    }
}
