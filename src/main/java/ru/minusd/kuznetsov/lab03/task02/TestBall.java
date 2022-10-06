package ru.minusd.kuznetsov.lab03.task02;

import java.util.Scanner;

public class TestBall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ball ball = new Ball();

        System.out.print("Enter starter coordinates (x and y) of the ball:\nStart x = ");
        double x = scanner.nextDouble();
        System.out.print("Start y = ");
        double y = scanner.nextDouble();
        ball.setXY(x,y);
        System.out.println(ball.toString());

        System.out.print("How much the ball moved relative to coordinates?\nRelative to x: ");
        x = scanner.nextDouble();
        System.out.print("Relative to y: ");
        y = scanner.nextDouble();
        ball.move(x,y);
        System.out.println("Now x = " + ball.getX() + ", y = " + ball.getY());

        ball.setX(0);
        ball.setY(0);
        System.out.println("program finished");

    }
}
