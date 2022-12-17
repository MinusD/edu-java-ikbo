package ru.minusd.vasiliev.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        var rand = new Random();
        var array = new ArrayList<Integer>();
        var linked = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            var num = rand.nextInt(420);
            array.add(num);
            linked.add(num);
        }
        var time = System.nanoTime();
        array.add(50, 420);
        System.out.printf("Вставка в ArrayList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        linked.add(50, 420);
        System.out.printf("Вставка в LinkedList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        array.remove(90);
        System.out.printf("Удаление из ArrayList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        linked.remove(90);
        System.out.printf("Удаление из LinkedList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        array.add(421);
        System.out.printf("Добавление в ArrayList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        linked.add(421);
        System.out.printf("Добавление в LinkedList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        array.indexOf(421);
        System.out.printf("Поиск в ArrayList: %d нс\n", System.nanoTime() - time);
        time = System.nanoTime();
        array.indexOf(421);
        System.out.printf("Поиск в LinkedList: %d нс\n", System.nanoTime() - time);
    }
}
