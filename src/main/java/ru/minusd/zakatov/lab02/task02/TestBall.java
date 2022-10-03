package ru.minusd.zakatov.lab02.task02;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(4, 5);
        Scanner in = new Scanner(System.in);
        System.out.println("Начальный мяч: " + ball);

        System.out.print("Устоновка поля, введите x: ");
        ball.setX(in.nextDouble());
        System.out.println(ball);

        System.out.print("Устоновка полей, введите x и y: ");
        ball.setXY(in.nextDouble(), in.nextDouble());
        System.out.println(ball);

        System.out.print("Перемещение, введите x и y: ");
        ball.move(in.nextDouble(), in.nextDouble());
        System.out.println(ball);

        System.out.println("Get x: " + ball.getX() + ", get y: " + ball.getY());
    }
}
