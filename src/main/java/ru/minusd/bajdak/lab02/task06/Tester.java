package ru.minusd.bajdak.lab02.task06;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        var circle1 = new Circle(new Point(12, 21), 3);
        var circle2 = new Circle(new Point(12, 21), 3);
        var circle3 = new Circle(new Point(14, 25), 3);

        System.out.println(circle1.getSquare() + " " + circle1.getCircumference());

        System.out.println(circle1.equals(circle2));
        System.out.println(circle2.equals(circle3));

    }
}
