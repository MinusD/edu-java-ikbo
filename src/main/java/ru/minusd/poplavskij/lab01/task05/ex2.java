package ru.minusd.poplavskij.lab01.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("size: ");
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            array.add((int) (Math.random() * 100));
        }
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.print("\ndel:");
        int del = in.nextInt();
        int ind = array.indexOf(del);
        while (ind != -1) {
            array.remove(ind);
            ind = array.indexOf(del);
        }
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n" + array.size());
        System.out.print("%10del:");
        del = in.nextInt();
        int finalDel = del;
        array.removeIf(s -> (s % 10 == finalDel));
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n" + array.size());
    }
}
