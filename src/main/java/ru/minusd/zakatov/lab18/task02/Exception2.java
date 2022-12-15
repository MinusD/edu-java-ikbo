package ru.minusd.zakatov.lab18.task02;

import java.util.Scanner;

public class Exception2 {
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
            System.out.println("Wrong number");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }

    public static void main(String[] args) {
        exceptionDemoTryCatch();
    }
}
