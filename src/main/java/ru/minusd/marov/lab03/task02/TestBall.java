package ru.minusd.marov.lab03.task02;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("input start x");
        double x = source.nextDouble();
        System.out.println("input start y");
        double y = source.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println("toString test");
        System.out.println(ball.toString());
        ball.setX(1.0);
        ball.setY(1.0);
        ball.setXY(2.0, 2.0);
        ball.move(3.0, 3.0);
        System.out.println("getX and getY test");
        System.out.println("x: " + ball.getX() + "\ny: " + ball.getY());
    }
}
