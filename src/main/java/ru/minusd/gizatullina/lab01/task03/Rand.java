package ru.minusd.gizatullina.lab01.task03;

import java.util.Random;
import java.util.Arrays;
public class Rand {
    public static void main(String[] args){
        Random random = new Random();
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];
        for (int i=0;i<10;i++){
            arr1[i]=random.nextInt(100);
        }
        for (int i=0;i<10;i++){
            arr2[i]=(int)(Math.random()*100);
        }
        Arrays.sort(arr1);
        for (int i=0;i<10;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("------");
        Arrays.sort(arr2);
        for (int i=0;i<10;i++){
            System.out.println(arr2[i]);
        }
    }
}