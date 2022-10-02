package ru.minusd.denisov.lab01.task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class WorkWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random(0);
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt(0, 100));
        }

        System.out.println(arrayList);
        System.out.println("Количество: " + arrayList.size());

        int x = scanner.nextInt();
        arrayList.removeAll(Collections.singleton(x));

        System.out.println(arrayList);
        System.out.println("Количество: " + arrayList.size());

        x = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 10 == x) {
                arrayList.remove(i);
                i--;
            }
        }

        System.out.println(arrayList);
        System.out.println("Количество: " + arrayList.size());

    }
}
