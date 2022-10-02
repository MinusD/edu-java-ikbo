package ru.minusd.isaeva.lab02.task02;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball(){}

    public Ball (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
}
