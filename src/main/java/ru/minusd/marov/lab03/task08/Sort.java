package ru.minusd.marov.lab03.task08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Sort {
    public static void main(String[] args) {
        String[] a = new String[]{"1", "2", "3", "4", "5"};
        System.out.print("Before sorting:\t");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        String temp;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        System.out.println();
        System.out.print("After sorting:\t");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");

        }
    }
}
