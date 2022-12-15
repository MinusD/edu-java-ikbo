package ru.minusd.budkov.lab02.task08;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextLine();
        }
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}