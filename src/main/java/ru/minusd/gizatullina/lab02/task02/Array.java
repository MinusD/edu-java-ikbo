package ru.minusd.gizatullina.lab02.task02;

import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int amount,n,x1,x2;
        System.out.print("Введите количество элементов массива:");
        amount=num.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(amount);
        for (int i=0;i<amount;i++){
            arr.add((int)(Math.random()*100));
        }
        System.out.println("Первоначальный массив:");
        for (int i=0;i<amount;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Первоначальное количество элементов массива:"+ amount);
        System.out.print("Введите число, которое хотите удалить из массива:");
        x1=num.nextInt();
        for (int i=0;i<amount;i++){
            if (arr.get(i)==x1){
                arr.remove(i);
                amount--;
            }
        }
        System.out.println("Массив после удаления первого числа:");
        for (int i=0;i<amount;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Количество элементов массива после первого удаления:"+ amount);
        System.out.print("Введите цифру, где числа, оканчивающиеся на нее хотите удалить:");
        x2=num.nextInt();
        for (int i=0;i<amount;i++){
            if (arr.get(i)%10==x2){
                arr.remove(i);
                amount--;
            }
        }
        System.out.println("Массив после удаления второго числа:");
        for (int i=0;i<amount;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Количество элементов массива после второго удаления:"+ amount);
    }
}
