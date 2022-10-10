package ru.minusd.zakatov.lab06.task02;

import ru.minusd.zakatov.lab06.task01.Movable;
import ru.minusd.zakatov.lab06.task01.MovablePoint;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean checkPointsSpeed() {
        return (topLeft.getXSpeed() == bottomRight.getXSpeed()) &&
                (topLeft.getYSpeed() == bottomRight.getYSpeed());
    }

    @Override
    public void moveUp() {
        if (checkPointsSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkPointsSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkPointsSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (checkPointsSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
