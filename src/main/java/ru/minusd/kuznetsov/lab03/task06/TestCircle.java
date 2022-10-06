package ru.minusd.kuznetsov.lab03.task06;

import java.util.ArrayList;

public class TestCircle {

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>();
        for (int i = 0; i < 5; i++) {
            Circle circle = new Circle(
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100,
                    ((double)((int)(Math.random() * 1000)))/100
            );
            circles.add(circle);

        }

        for (Circle circle :
                circles) {
            System.out.println(circle.toString());
            System.out.println();
        }

        circles.get(0).compareCircle(circles.get(1));
    }
}
