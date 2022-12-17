package ru.minusd.bulgakova.lab02.task01;

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        int state = console.nextInt();
        int first=0, second = 1, temp;
        for (int i=0; i<length+state; i++){
            if (i>=state) System.out.print(first + " ");
            temp=first+second;
            first = second;
            second = temp;
        }
    }
}

