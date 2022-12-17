package ru.minusd.denisov.lab01.task05;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double decimal_number = scanner.nextDouble();
        int to = scanner.nextInt();

        System.out.println("В " + to + "-ной: " + convert(decimal_number, to));
        System.out.println("В 2-ной: " + convert(decimal_number, 2));
        System.out.println("В 16-ной: " + convert(decimal_number, 16));
    }

    public static String convert(double decimal_number, int to) {
        int integer_part_of_decimal = (int) decimal_number;
        double fractional_part_of_decimal = decimal_number - integer_part_of_decimal;
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String result = "";
        while (integer_part_of_decimal > 0) {
            result = digits.charAt(integer_part_of_decimal % to) + result;
            integer_part_of_decimal /= to;
        }

        if (fractional_part_of_decimal > 0) {
            result += ".";
            for (int i = 0; i < 3; i++) {
                fractional_part_of_decimal *= to;
                result += digits.charAt((int) fractional_part_of_decimal);
                fractional_part_of_decimal = fractional_part_of_decimal % 1;
            }
        }
        return result;
    }

}
