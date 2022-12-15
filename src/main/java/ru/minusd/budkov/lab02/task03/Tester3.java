package ru.minusd.budkov.lab02.task03;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Circle arr[] = new Circle[n];
        double x, y;
        for(int i = 0; i < n; i++){
            arr[i] = new Circle(new Point(1,2));
        }
        System.out.println(arr[1].center.x);
    }
}