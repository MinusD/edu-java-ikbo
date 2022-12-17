package ru.minusd.vasiliev.lab01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    private static int RAND_LIMIT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = randomGenerate(count);
        System.out.println("Библиотека Random: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        array = mathRandomGenerate(count);
        System.out.println("Метод Math.random(): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] randomGenerate(int count){
        int[] array = new int[count];
        Random rand = new Random();
        for(int i = 0; i < count; i++){
            array[i] = rand.nextInt(RAND_LIMIT);
        }
        return array;
    }

    private static int[] mathRandomGenerate(int count){
        int[] array = new int[count];
        for(int i = 0; i < count; i++){
            array[i] = (int)(Math.random() * RAND_LIMIT) + 1;
        }
        return array;
    }
}
