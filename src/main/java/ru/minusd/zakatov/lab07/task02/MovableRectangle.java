package ru.minusd.zakatov.lab07.task02;

import ru.minusd.zakatov.lab07.task01.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
            && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        if (!speedTest()) return;
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!speedTest()) return;
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!speedTest()) return;
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!speedTest()) return;
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
