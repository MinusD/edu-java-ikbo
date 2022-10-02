package ru.minusd.denisov.lab02.task02;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x, y;
        System.out.print("Координаты нового мяча: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        Ball ball = new Ball(x, y);
        System.out.println(ball);

        ball.move(2.5, -3.5);
        System.out.println("Мяч перемещен на 2.5, -3.5");
        System.out.println(ball);
    }
}
