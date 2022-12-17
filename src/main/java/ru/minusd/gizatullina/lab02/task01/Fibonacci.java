package ru.minusd.gizatullina.lab02.task01;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int a,b,x1,x2=1,x3=0;
        System.out.print("Введите длину последовательности Фибоначчи:");
        a=num.nextInt();
        System.out.print("Введите первый элемент последовательности Фибоначчи:");
        b=num.nextInt();
        if (b==1){
            System.out.print(x3+" ");
            System.out.print(x2+" ");
        }
        if (b==2){
            System.out.print(x2+" ");
        }
        for (int i=3;i<a+b;i++){
            x1=x2+x3;
            x3=x2;
            x2=x1;
            if (i>=b){
                System.out.print(x1+" ");
            }
        }
    }
}
