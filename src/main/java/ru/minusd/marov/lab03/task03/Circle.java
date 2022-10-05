package ru.minusd.marov.lab03.task03;

public class Circle {
    private Point c;

    public Circle(double x, double y) {
        c = new Point(x, y);
    }

    public void newPoint(double x, double y) {
        Point point = new Point(x, y);
    }
    public void setC(double x, double y) { c.setXY(x, y); }
}
