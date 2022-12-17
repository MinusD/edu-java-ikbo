package ru.minusd.poplavskij.lab02.task06;

public class Circle {
    public double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * this.r * this.r;
    }

    public double getPerimetr() {
        return 6.28 * this.r;
    }

    public boolean compare(Circle circle) {
        return (this.getR() > circle.getR());
    }
}