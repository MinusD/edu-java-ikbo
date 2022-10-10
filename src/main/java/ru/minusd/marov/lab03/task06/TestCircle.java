package ru.minusd.marov.lab03.task06;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int currentR = sc.nextInt();
        Circle circle1 = new Circle(currentR);
        System.out.println(circle1.getLength());
        System.out.println(circle1.getSquare());
        sc.nextLine();
        System.out.println("Enter the radius of the circle 2");
        currentR = sc.nextInt();
        Circle circle2 = new Circle(currentR);
        sc.nextLine();
        System.out.println("Enter the radius of the circle 3");
        currentR = sc.nextInt();
        Circle circle3 = new Circle(currentR);
        circle1.comparison(circle2);
        circle2.comparison(circle3);
    }
}
