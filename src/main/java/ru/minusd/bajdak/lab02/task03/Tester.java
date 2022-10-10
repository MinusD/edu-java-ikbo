package ru.minusd.bajdak.lab02.task03;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static List<Circle> circles;
    public static int size;

    public static void main(String[] args) {
        circles = new ArrayList<>();

        circles.add(new Circle(new Point(10, 20), 10));
        size++;
        circles.add(new Circle(new Point(40, 50), 20));
        size++;
        System.out.println(
                circles.get(0).getPoint().getX() + " " + circles.get(0).getPoint().getY() + " " +
                        circles.get(0).getRadius()
        );
        System.out.println(
                circles.get(1).toString() + "\n\n" + circles.get(1).getPoint().toString()
        );
    }

}
