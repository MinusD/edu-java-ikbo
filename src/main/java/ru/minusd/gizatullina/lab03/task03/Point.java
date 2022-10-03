package ru.minusd.gizatullina.lab03.task03;
public class Point {
    public double x=0.0;
    public double y=0.0;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point(){}

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}

