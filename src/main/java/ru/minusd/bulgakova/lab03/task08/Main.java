package ru.minusd.bulgakova.lab03.task08;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> vector = new ArrayList<Integer>();
        System.out.print("Input size of array: ");
        int size = console.nextInt();
        for (int i = 0; i < size; i++) {
            vector.add( (int)(Math.random()*100));
        }
        System.out.println("Before swap: " + vector);
        for (int i = 0; i < vector.size()/2; i++) {
            Collections.swap(vector, i, vector.size()-1-i);
        }

        System.out.println("After swap: " + vector);
    }
}

