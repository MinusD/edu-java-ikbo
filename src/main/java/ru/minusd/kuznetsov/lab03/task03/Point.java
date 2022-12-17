package ru.minusd.kuznetsov.lab03.task03;

public class Point {
    private String name = "point";
    private double x = 0.0;
    private double y = 0.0;

    public Point() {
    }

    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return name +
                " x = " + x +
                ", y = " + y;
    }
}
