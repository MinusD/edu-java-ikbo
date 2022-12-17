package ru.minusd.gizatullina.lab07.task02;

public class Main {
    public static void main(String[] args) {
        MovableRectangle a = new MovableRectangle();
        System.out.println("Rectangle before move:");
        System.out.println(a.toString());
        a.moveUp(10);
        a.moveRight(5);
        System.out.println("Rectangle after move:");
        System.out.println(a.toString());
    }
}
