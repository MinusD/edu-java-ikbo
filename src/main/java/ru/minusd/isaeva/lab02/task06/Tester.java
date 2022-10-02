package ru.minusd.isaeva.lab02.task06;
import java.util.Scanner;

public class Tester {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Circle circle1 = new Circle(in.nextDouble());
        Circle circle2 = new Circle();
        double r = in.nextDouble();
        circle2.setR(r);
        if (circle1.compareTo(circle2) >= 0)
            System.out.println("Площадь первого: " + circle1.square() );
        else
            System.out.println("Длина второго: " + circle2.length() );
    }
}
