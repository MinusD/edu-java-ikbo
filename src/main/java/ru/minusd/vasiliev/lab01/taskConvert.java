package ru.minusd.vasiliev.lab01;

import java.util.Scanner;

public class taskConvert {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double number;
        int system;
        System.out.print("Введите число, переводимое в другие СС: ");
        number = scanner.nextDouble();
        System.out.print("Введите целевую СС: ");
        system = scanner.nextInt();

        System.out.println(convert(number, system));
        System.out.println(convert(number, 2));
        System.out.println(convert(number, 16));
    }

    private static String convert(double number, int system){
        String pastDot = convertPastDot(number, system);
        String beforeDot = convertBeforeDot((int)number, system);

        return beforeDot + '.' + pastDot;
    }

    private static String convertPastDot(double number, int system){
        String pastDot = "";
        number -= (int) number;
        int digit;
        for (int i = 1; i <= 3; i++){
            number *= system;
            digit = (int)number;
            if (digit >= 10) {
                pastDot += (char) (digit + 55);
            } else {
                pastDot += digit;
            }
            number -= digit;
        }
        return pastDot.toString();
    }

    private static String convertBeforeDot(int number, int system){
        String beforeDot = "";
        int digit;
        while (number != 0){
            digit = number % system;
            if (digit >= 10) {
                beforeDot = ((char) (digit + 55)) + beforeDot;
            } else {
                beforeDot = digit + beforeDot;
            }
            number /= system;
        }
        return beforeDot.toString();
    }
}