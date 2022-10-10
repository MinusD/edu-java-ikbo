package ru.minusd.zakatov.lab06.task05;

import ru.minusd.zakatov.lab06.task01.Movable;

public class MovableCircle extends Circle implements Movable {
    protected double xSpeed;
    protected double ySpeed;

    public MovableCircle(Point center, double radius, double xSpeed, double ySpeed) {
        super(center, radius);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        center.setY(center.getY() - ySpeed);
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() + ySpeed);
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - ySpeed);
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + ySpeed);
    }
}
