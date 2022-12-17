package ru.minusd.gizatullina.lab07.task03;

public class Main {
    public static void main(String[] args) {
        MovablePoint topleft = new MovablePoint(2,1,10,5);
        MovablePoint bottomright = new MovablePoint(1,2,10,5);
        MovableRectangle a = new MovableRectangle(topleft,bottomright);
        System.out.println("Rectangle before move: ");
        System.out.println(a.toString());
        a.moveUp();
        a.moveRight();
        System.out.println("Rectangle after move: ");
        System.out.println(a.toString());
        System.out.println(a.SpeedTest());
    }
}
