package ru.minusd.budkov.lab02.task06;

public class CircleTest {
    public static void main(String args[]){
        Circle c1 = new Circle(1.0,2.0,3.0);
        Circle c2 = new Circle(0.0,2.0,4.0);
        c2.setX(1.0);
        c2.setR(3.0);
        System.out.println(c1.equals(c2));
    }
}
