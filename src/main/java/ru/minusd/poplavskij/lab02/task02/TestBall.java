package ru.minusd.poplavskij.lab02.task02;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(2.5,3.7);
        Ball ball2 = new Ball();
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        ball2.setXY(-2.4, -5.1);
        ball1.setX(10.0);
        ball1.setY(9.0);
        ball1.move(5,5);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
