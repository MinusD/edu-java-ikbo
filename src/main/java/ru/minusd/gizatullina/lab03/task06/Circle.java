package ru.minusd.gizatullina.lab03.task06;

public class Circle {
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point.toString() +
                ", radius=" + radius +
                '}';
    }

    public double Square(){
        return 3.14*getRadius()* getRadius();
    }

    public double Length(){
        return 2*3.14*getRadius();
    }

}