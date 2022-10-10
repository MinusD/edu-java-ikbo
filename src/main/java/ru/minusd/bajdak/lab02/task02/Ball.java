package ru.minusd.bajdak.lab02.task02;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public double getX() {
        return x;
    }


    public Ball() {
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

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void move(double xDisp, double yDisp){
        x = yDisp;
        y = xDisp;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
