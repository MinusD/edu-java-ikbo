package ru.minusd.isaeva.lab01.task01;

import javax.swing.*;
import java.util.Scanner;

public class Qwer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int count = Integer.parseInt(in.nextLine());
        int[] numbers = new int[count];
        System.out.println("Вводите элементы массива");
        int i = 0;
        while(i < count) {
            numbers[i] = in.nextInt();
            i++;
        }


        i = 0;
        int sum = 0;
        while(i < count) {
            sum += numbers[i];
            i++;
        }
        System.out.println(sum);


        i = 0;
        sum = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < count);
        System.out.println(sum);


        sum=0;
        for( i=0; i<count ; i++){
           sum+=numbers[i];
        }
        System.out.println(sum);
    }
}

