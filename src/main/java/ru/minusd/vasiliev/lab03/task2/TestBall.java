package ru.minusd.vasiliev.lab03.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.getX() + " " + ball.getY());
        ball.move(1, 3);
        System.out.println(ball);
        ball.setX(-4);
        System.out.println(ball);
        ball.setXY(55, 21);
        System.out.println(ball);
    }
}
