package ru.minusd.gizatullina.lab07.task01;

public class Main {
    public static void main(String[] args) {
        MovableRectangle a = new MovableRectangle(1, 2,5,7);
        System.out.println("Rectangle before move:");
        System.out.println(a.toString());
        a.moveDown(5);
        a.moveRight(3);
        System.out.println("Rectangle after move:");
        System.out.println(a.toString());
    }
}
