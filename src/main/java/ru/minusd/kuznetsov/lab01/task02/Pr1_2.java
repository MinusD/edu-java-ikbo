package ru.minusd.kuznetsov.lab01.task02;

/*
Пр№1 Задание №2)
Вывести сумму первых 10 чисел Гармонического ряда.
 */
public class Pr1_2 {
    public static void main(String[] args) {
        double sum = 0;
        int n = 10;
        System.out.println("First 10 numbers of the Gharmonic series:");
        for (int i = 1; i < n+1; i++) {
            double ch = 1 / (double) i;
            System.out.print(i + " number: ");
            System.out.printf("%.2f\n", ch);
            sum += ch;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}