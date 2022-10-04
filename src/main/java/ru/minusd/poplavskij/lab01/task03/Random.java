package ru.minusd.poplavskij.lab01.task03;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();

        java.util.Random random = new java.util.Random();
        int[] arr2=new int[10];
        for (int i = 0; i < 10; i++) {
            arr2[i]=random.nextInt(100);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr2);
        for (int val:arr2){
            System.out.print(val + " ");
        }
    }
}
