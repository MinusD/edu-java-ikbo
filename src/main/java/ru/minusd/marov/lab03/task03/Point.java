package ru.minusd.marov.lab03.task03;

public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public void setXY(double x, double y) { this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }

    public String toString() {
        return "x: " + x +
                "\ny: " + y;
    }
}
