package ru.minusd.gizatullina.lab07.task02;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;

    private MovablePoint bottomRight;

    public MovableRectangle() {
        topLeft = new MovablePoint(0,1);
        bottomRight = new MovablePoint(1, 0);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp(double y) {
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }

    @Override
    public void moveRight(double x) {
        topLeft.moveRight(x);
        bottomRight.moveRight(x);
    }

    @Override
    public void moveDown(double y) {
        topLeft.moveDown(y);
        bottomRight.moveDown(y);
    }

    @Override
    public void moveLeft(double x) {
        topLeft.moveLeft(x);
        bottomRight.moveLeft(x);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }
}
