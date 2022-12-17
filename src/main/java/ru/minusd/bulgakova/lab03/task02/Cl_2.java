package ru.minusd.bulgakova.lab03.task02;

import java.util.Scanner;

public class Cl_2 {
    public static void main(String[] args) {
        Cl_1 ball1 =new Cl_1();
        System.out.println("First "+ball1.toString());
        Scanner console = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = console.nextDouble();
        System.out.print("Input y: ");
        double y = console.nextDouble();
        Cl_1 ball2 = new Cl_1(x,y);
        System.out.println("Second "+ball2.toString());
        Cl_1 ball3 = new Cl_1();
        System.out.println("Third "+ball3.toString());
        System.out.print("Change x: ");
        x = console.nextDouble();
        ball3.setX(x);
        System.out.println("Third ball x: "+ball3.getX());
        System.out.print("Change y: ");
        y = console.nextDouble();
        ball3.setY(y);
        System.out.println("Third ball y: "+ball3.getY());
        System.out.println("Third "+ball3.toString());

    }
}

