package ru.minusd.bulgakova.lab03.task02;

public class Cl_1 {
    private double x=0.0;
    private double y=0.0;
    public Cl_1(double x, double y){
        this.x=x;
        this.y=y;
    }
    public  Cl_1(){};

    public double getX() {return x;}

    public double getY() {return y;}

    public void setX(double x) {this.x = x;}

    public void setY(double y) {this.y = y;}

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDis, double yDis){
        x+=xDis;
        y+=yDis;
    }
    @Override
    public String toString(){
        return "ball ("+x+", "+y+")";
    }
}

