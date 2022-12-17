package ru.minusd.kuznetsov.lab01.task03;
import java.util.Arrays;
import java.util.Random;

/*
Пр№1 Задание №3)
Сгенерировать целочисленный массив при помощи библиотек Random и Math.random.
Отсортировать (Arrays) и вывести.
 */
public class Pr1_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) + 1;
        }

        System.out.println("Generated array(Random):");
        System.out.println(Arrays.toString(array1));

        Arrays.sort(array1);
        System.out.println("Sorted array(Random):");
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }

        System.out.println("Generated array(Math.random):");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("Sorted array(Math.random):");
        System.out.println(Arrays.toString(array2));


    }
}