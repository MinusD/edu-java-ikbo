package ru.minusd.poplavskij.lab02.task06;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1,2,3);
        Circle circle2 = new Circle(4,5,6);

        System.out.println(circle1.getPerimetr());
        System.out.println(circle2.getArea());

        System.out.println("circle1 > circle2?");
        System.out.println(circle1.compare(circle2));
    }
}
