package ru.minusd.poplavskij.lab01.task01;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //сумма элементов целочисленного массива
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        int sum = 0;
        for (int a:arr){
            sum+=a;
        }
        System.out.println("sum = \nfor: " + sum);
        int i = 0;
        sum=0;
        while (i<size){
            sum+=arr[i];
            i++;
        }
        System.out.println("while: " + sum);

        i=0;
        sum=0;
        do{
            sum+=arr[i];
            i++;
        }while(i<size);
        System.out.println("do-while: " + sum);
    }
}
