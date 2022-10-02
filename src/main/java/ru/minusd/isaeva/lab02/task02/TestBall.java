package ru.minusd.isaeva.lab02.task02;
import java.util.Scanner;

public class TestBall {
    public static void main (String[] args){
        Ball ball1 = new Ball(1.2, 1.3);
        Ball ball2 = new Ball();
        System.out.println("Координаты ball1: (" + ball1.getX() + ", " + ball1.getY() + ")");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату х:" );
        double x = in.nextDouble();
        System.out.println("Введите координату у" + ":" );
        double y = in.nextDouble();
        ball2.setXY(x,y);
        ball1.move(1.5, 1.5);
        System.out.println("Координаты ball1: (" + ball1.getX() + ", " + ball1.getY() + ")");
        System.out.println("Координаты ball2: (" + ball2.getX() + ", " + ball2.getY() + ")");

    }
}
