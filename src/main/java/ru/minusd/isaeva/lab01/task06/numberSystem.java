package ru.minusd.isaeva.lab01.task06;

import java.util.Scanner;
public class numberSystem {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = Double.parseDouble(in.nextLine());
        System.out.println("Введите систему счисления: ");
        int system = Integer.parseInt(in.nextLine());
        System.out.println("Число в " + system + "-ой системе счисления: " + translate(number, system));
        System.out.println("Число в 2-ой системе счисления: " + translate(number, 2));
        System.out.println("Число в 16-ой системе счисления: " + translate(number, 16));

    }

    public static String translate(double number, int system) {
        int x = (int) number;
        number = number - x;
        String numberNewSystem = "";
        String[] alfabet = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        while (x > 0) {
            numberNewSystem = alfabet[(x % system)] + numberNewSystem;
            x /= system;
        }
        if (number > 0){
            numberNewSystem += ".";
            for (int i = 0; i < 3; i++) {
                number = number * system;
                numberNewSystem =numberNewSystem + alfabet[(int) (number)];
                number -= (int) number;
            }
        }
        return numberNewSystem;
    }
}