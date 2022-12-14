package ru.minusd.vasiliev.lab18.task02;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите число: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода");
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}