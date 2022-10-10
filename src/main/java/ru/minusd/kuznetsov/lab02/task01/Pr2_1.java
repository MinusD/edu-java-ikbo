package ru.minusd.kuznetsov.lab02.task01;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Пр№2 Задание №1)
Вывести числа Фибоначчи.
Первое число - длина.
Второе число - с какого по счету (индекс элемента чисел Фибоначчи)
 */
public class Pr2_1 {
    public static void main(String[] args) {
        int prev = 0;
        int cur = 1;
        int index = 1;
        int myindex;
        int len;
        boolean startPrint = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter len of Fibonacchi: ");
        len = scanner.nextInt();
        System.out.print("Enter start index: ");
        myindex = scanner.nextInt();

        while (index != myindex + len - 1)
        {
            cur += prev;
            prev = cur - prev;
            index += 1;
            if (index == myindex)
                startPrint = true;
            if (startPrint)
                System.out.println("Fibo: " + cur + " Index: " + index);
        }
    }
}