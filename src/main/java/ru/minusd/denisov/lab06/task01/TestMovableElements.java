package ru.minusd.denisov.lab06.task01;

import java.util.Scanner;

public class TestMovableElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное положение окружности и её радиус (x y r): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.print("Введите скорость по x и y: ");
        int xSpeed = scanner.nextInt();
        int ySpeed = scanner.nextInt();

        MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, r);
        System.out.println("Создана окружность:\n" + circle);

        int cmd = 1;
        while (cmd != 0) {
            System.out.println("\n0 - Exit\t1 - MoveUp\t2 - MoveDown\t3 - MoveLeft\t4 - MoveRight");
            System.out.print("Введите команду: ");
            cmd = scanner.nextInt();
            switch (cmd) {
                default:
                    break;
                case 1:
                    circle.moveUp();
                    System.out.println(circle);
                    break;
                case 2:
                    circle.moveDown();
                    System.out.println(circle);
                    break;
                case 3:
                    circle.moveLeft();
                    System.out.println(circle);
                    break;
                case 4:
                    circle.moveRight();
                    System.out.println(circle);
                    break;
            }
        }
    }
}
