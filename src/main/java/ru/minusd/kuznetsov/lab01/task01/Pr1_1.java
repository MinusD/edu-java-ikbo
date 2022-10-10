package ru.minusd.kuznetsov.lab01.task01;
import java.util.Arrays;
import java.util.Scanner;

/*
Пр№1 Задание №1)
Посчитать сумму элементов в целочисленном массиве и вывести ее
(Продемонстрировать использование циклов: for, while и do/while)
 */
public class Pr1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        System.out.print("Enter a number of array elements: ");
        n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i+1) + " elem of array");
            array[i] = scanner.nextInt();
        }

        //вывод элементов массива при помощи цикла for
        System.out.println("Array's elems with using (for): ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        //вывод элементов массива при помощи цикла while
        int k = 0;
        System.out.println("Array's elems with using (while): ");
        while (k != array.length){
            System.out.print(array[k] + " ");
            k++;
        }

        System.out.println();

        //вывод элементов массива при помощи цикла do/while
        System.out.println("Array's elems with using (do/while): ");
        if (array.length!=0) {
            int j = 0;
            do {
                System.out.print(array[j] + " ");
                j++;
            } while (j != array.length);
        }

        System.out.println();

        //вывод при помощи Arrays
        System.out.println("Array's elems with using 'Arrays' library");
        System.out.println(Arrays.toString(array));

        System.out.println("Sum of array elems:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}