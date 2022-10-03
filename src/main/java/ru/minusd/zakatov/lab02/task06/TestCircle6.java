package ru.minusd.zakatov.lab02.task06;

import ru.minusd.zakatov.lab02.task03.Circle;
import ru.minusd.zakatov.lab02.task03.Point;

import java.util.Scanner;

public class TestCircle6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point point = new Point(5, 3);
        Circle circle = new Circle(point, 4);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Length: " + circle.getLength());

        System.out.print("Введите radius: ");
        circle.setRadius(in.nextDouble());
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Length: " + circle.getLength());

        System.out.print("Введите center и radius: ");
        Circle circle1 = new Circle(new Point(in.nextDouble(), in.nextDouble()), in.nextDouble());
        System.out.println(circle1);
        if (circle.equals(circle1)) {
            System.out.println("Круги равны");
        } else {
            System.out.println("Круги не равны");
        }
    }
}
