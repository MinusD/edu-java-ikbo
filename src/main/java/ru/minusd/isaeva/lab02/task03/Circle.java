package ru.minusd.isaeva.lab02.task03;

public class Circle {
    Point center = new Point(0.0, 0.0);
    double r = 0.0;
    public Circle(){
    }
    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }

    public void setCenter(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public Point getCenter() {
        return center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
