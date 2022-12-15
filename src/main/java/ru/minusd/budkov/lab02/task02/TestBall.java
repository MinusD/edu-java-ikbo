package ru.minusd.budkov.lab02.task02;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball();
        ball.setX(1);
        ball.setY(1);
        ball.move(3,7);
        System.out.println(ball.toString());
    }
}