package ru.minusd.isaeva.lab02.task03;
import ru.minusd.isaeva.lab02.task03.Circle;

import java.util.Scanner;
public class Tester {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Circle[] circles = new Circle[size];
        for (int i = 0; i < size; i++){
            Circle circle = new Circle();
            double x = in.nextDouble();
            double y = in.nextDouble();
            circle.setCenter(x, y);
            double r = in.nextDouble();
            circle.setR(r);
            circles[i]=circle;
        }
        for (int i = 0; i < size; i++){
            System.out.println("Координаты: (" +circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")"+ " и радиус: "+ circles[i].getR() );
        }
    }
}
