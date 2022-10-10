package ru.minusd.kuznetsov.lab03.task03;

public class Circle {
    Point centre;
    Point point;

    public Circle(double centreX, double centreY, double pointX, double pointY) {
        this.centre = new Point("Centre", centreX, centreY);
        this.point = new Point("Point", pointX, pointY);
    }

    public Point getCentre() {
        return centre;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Circle: " + getCentre() + " " + getPoint();
    }
}
