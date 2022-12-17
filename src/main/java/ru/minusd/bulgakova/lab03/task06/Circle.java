package ru.minusd.bulgakova.lab03.task06;

public class Circle {
    private double radius;
    private int number;

    public Circle(int number,double radius){
        this.number = number;
        this.radius=radius;
    }
    public void getS(){
        System.out.println("Square of "+this.number+" circle = "+ radius*radius*Math.PI);
    }

    public void getC(){
        System.out.println("Circumference of "+this.number+" circle = "+ 2*radius*Math.PI);
    }

    public void comparison (Circle cir2) {
        if (this.radius > cir2.radius){
            System.out.println(this.number+" circle is bigger than "+cir2.number);
            return;
        }
        if (this.radius < cir2.radius){
            System.out.println(cir2.number+" circle is bigger than "+this.number);
            return;
        }
        System.out.println(this.number+" and "+cir2.number+" circles are the same size");
    }
}
