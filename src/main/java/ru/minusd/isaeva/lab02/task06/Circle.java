package ru.minusd.isaeva.lab02.task06;


import java.util.Objects;

public class Circle {
    double r = 0.0;
    public Circle(){ }
    public Circle( double r){
        this.r = r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double square(){
        return Math.PI*getR()*getR();
    }

    public double length(){
        return Math.PI*2*getR();
    }
    public int compareTo(Circle o){
        if (o.getR()==this.getR())
            return 0;
        else
            if (o.getR()>this.getR())
                return -1;
            else
                return 1;

    }

}
