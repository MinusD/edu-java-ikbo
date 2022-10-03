package ru.minusd.denisov.lab02.task03;

public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        center = new Point(x, y);
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenter(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Окружность{" +
                "центр: " + center +
                ", радиус: " + r +
                '}';
    }
}
