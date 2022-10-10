package ru.minusd.bajdak.lab02.task02;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ball1 = new Ball();
        ball1.move(10,20);
        System.out.println("X, Y " + ball1.getY() + " " + ball1.getY());

        var ball2 = new Ball(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ball2.toString());
        System.out.println("Новые координаты X & Y");
        ball1.setXY(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ball2.toString());

        System.out.println("Новый X");
        ball2.setX(scanner.nextDouble());

        System.out.println("Новый Y");
        ball2.setY(scanner.nextDouble());

        System.out.println(ball2.toString());
    }
}
