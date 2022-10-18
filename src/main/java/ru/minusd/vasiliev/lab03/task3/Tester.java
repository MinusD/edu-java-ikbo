package ru.minusd.vasiliev.lab03.task3;

public class Tester {
    private static Circle[] objArray;
    private static int count;

    public static void main(String[] args) {
        count = 5;
        objArray = new Circle[count];
        for (int i = 0; i < count; i++) {
            objArray[i] = new Circle(new Point(Math.random() * 15, Math.random() * 15));
            System.out.println(objArray[i].getCenter().toString());
        }
    }
}
