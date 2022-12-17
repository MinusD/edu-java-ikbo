package ru.minusd.gizatullina.lab01.task01;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] arr = new int[x];
        for (int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int c1=0,c2=0,c3=0;
        for (int i=0;i<x;i++){
            c1=c1+arr[i];
        }
        int i=0;
        while (i<x){
            c2=c2+arr[i];
            i++;
        }
        i=0;
        do{
            c3=c3+arr[i];
            i++;
        }while (i<x);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
