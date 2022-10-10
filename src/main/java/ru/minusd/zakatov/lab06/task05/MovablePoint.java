package ru.minusd.zakatov.lab06.task05;

import ru.minusd.zakatov.lab06.task01.Movable;

public class MovablePoint extends Point implements Movable {
    protected double xSpeed;
    protected double ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x += xSpeed;
    }

    @Override
    public void moveRight() {
        x -= xSpeed;
    }
}
