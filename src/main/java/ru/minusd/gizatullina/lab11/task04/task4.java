package ru.minusd.gizatullina.lab11.task04;

import java.util.ArrayList;
import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrAL = new ArrayList<>();
        LinkedList<Integer> arrLL = new LinkedList<>();

        long time  = System.nanoTime();
        arrAL.add(1);
        time = System.nanoTime() - time;
        System.out.print("arraylist add operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrLL.add(1);
        time = System.nanoTime() - time;
        System.out.print("linkedlist add operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrAL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.print("arraylist insert operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrLL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.print("linkedlist insert operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrAL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("arraylist remove operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrLL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("linkedlist remove operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrAL.get(0);
        time = System.nanoTime() - time;
        System.out.print("arraylist find operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

        time = System.nanoTime();
        arrLL.add(0, 1);
        time = System.nanoTime() - time;
        System.out.print("linkedlist find operation time: ");
        System.out.printf("%,9.3f ms\n", time /1_000_000.0);

    }
}
