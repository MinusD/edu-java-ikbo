package ru.minusd.bajdak.lab02.task06;

import java.util.Objects;

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

    public double getSquare() {
        return radius * radius * 3.14;
    }

    public double getCircumference() {
        return radius * 3.14 * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.point.getX(), point.getX()) == 0 &&
                Double.compare(circle.point.getY(), point.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "point=" + point + ", radius=" + radius + '}';
    }
}
