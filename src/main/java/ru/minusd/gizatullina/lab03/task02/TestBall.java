package ru.minusd.gizatullina.lab03.task02;

public class TestBall {
    public static void main(String[] args){
        Ball a = new Ball(1,2);
        System.out.println(a.toString());
        a.move(5,2);
        System.out.println(a.toString());
        a.setXY(10,10);
        System.out.println(a.toString());
    }
}
