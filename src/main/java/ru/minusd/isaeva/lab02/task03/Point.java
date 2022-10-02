package ru.minusd.isaeva.lab02.task03;

public class Point {
    double x = 0.0;
    double y = 0.0;

    public Point (){}

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
}
