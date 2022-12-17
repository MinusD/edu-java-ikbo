package ru.minusd.poplavskij.lab02.task03;

public class Circle {
    private Point centre;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.centre = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre: x=" + centre.getX()+", y =" + centre.getY()+
                ", radius=" + radius +
                '}';
    }
}
