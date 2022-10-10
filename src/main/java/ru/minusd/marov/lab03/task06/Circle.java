package ru.minusd.marov.lab03.task06;

import java.util.ArrayList;

public class Circle {
    private int r;

    private int i = 0;

    private Circle[] circle = new Circle[2];
    private final double PI = 3.14;

    public Circle(int r){
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLength(){
        return 2*PI*r;
    }

    public double getSquare(){
        return PI * Math.pow(r, 2);
    }

    public void setCircle(int i, int newValue){
        circle[i].r = newValue;
    }

    public void comparison(Circle circle){
        if (circle.r < this.r){ System.out.println("The circle with r = "+this.r+" larger"); }
        else if (circle.r == this.r) { System.out.println("The circles are equal"); }
        else if (circle.r > this.r) { System.out.println("The circle with r = "+circle.r+" larger"); }
    }


}
