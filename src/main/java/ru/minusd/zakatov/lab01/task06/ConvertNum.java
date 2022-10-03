package ru.minusd.zakatov.lab01.task06;

import java.util.Scanner;

public class ConvertNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        double num = in.nextDouble();

        System.out.print("Base: ");
        int base = in.nextInt();

        System.out.println("Bin: " + translateToBase(num, 2));
        System.out.println("Hex: " + translateToBase(num, 16));
        System.out.println("Your base: " + translateToBase(num, base));
    }

    public static String translateToBase(double num, int base) {
        int intPart = (int) num;
        double fracPart = num - intPart;

        StringBuilder translatedNum = new StringBuilder();

        // Translate intPart
        while (intPart > 0) {
            int digit = intPart % base;
            translatedNum.append(getStringForDigit(digit));
            intPart /= base;
        }
        translatedNum.reverse();
        translatedNum.append(",");

        // Translate fracPart
        for (int i = 0; i < 3; i++) {
            int digit = (int) (base * fracPart);
            fracPart = fracPart * base - digit;
            translatedNum.append(getStringForDigit(digit));
        }

        return translatedNum.toString();
    }

    public static String getStringForDigit(int digit) {
        if (digit < 10) {
            return String.valueOf(digit);
        }
        int startLetters = 65;
        return String.valueOf((char) (startLetters + digit - 10));
    }

}
