package ru.minusd.bajdak.lab01.task01;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // Сумма массива
        System.out.println("Сумма чисел в массиве");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []arr = new int[size];
        int sum = 0;
        for(int i = 0; i < size; ++i){
            arr[i] = scan.nextInt();
            sum+= arr[i];
        }
        System.out.println("Сумма чисел в массиве равна: "+sum);
        // Гармонические числа
        System.out.println("Гармонические числа:");
        for(int i = 1; i<11; ++i){
            double a = 1.0/i;
            System.out.println(String.format("%.2f", a)+" ");
        }
        // Рандомные значения
        int []arr1 = new int[10];
        int []arr2 = new int[10];
        final Random r = new Random(); // ЭТО ПЛОХО
        for(int i = 0; i < 10; ++i){
            arr1[i] = r.nextInt(50); // ЭТО ХОРОШО(до java 7)
            arr2[i] = ThreadLocalRandom.current().nextInt(50); // Это А?УЕННО(в 3.6 раза быстрее, проще, качественнее)
            System.out.println(arr2[i]);
        }

    }
}