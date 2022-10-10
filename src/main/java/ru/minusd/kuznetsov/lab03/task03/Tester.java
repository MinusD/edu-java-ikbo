package ru.minusd.kuznetsov.lab03.task03;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>();
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100
            );
            circles.add(circle);
            System.out.println(circle.toString());
        }
    }
}
