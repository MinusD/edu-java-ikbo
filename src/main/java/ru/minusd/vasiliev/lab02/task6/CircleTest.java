package ru.minusd.vasiliev.lab02.task6;

public class CircleTest {
    public static void main(String[] args) {
        var c1 = new Circle(5);
        var c2 = new Circle(8);
        System.out.println(c1.getRadius());
        System.out.println(c1.getSquare());
        System.out.println(c1.getLength());
        System.out.println(c2.getRadius());
        System.out.println(c2.getSquare());
        System.out.println(c2.getLength());
        c2.setRadius(2);
        System.out.println(c2.getRadius());
        System.out.println(c1.compareTo(c2));
    }
}
