package ru.minusd.denisov.lab06.task02;

import java.util.Scanner;

public class TestMovableRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите верхнюю левую точку прямоугольника (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Введите нижнюю правую точку прямоугольника (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Введите скорость по x и y: ");
        int xSpeed = scanner.nextInt();
        int ySpeed = scanner.nextInt();

        MovableRectangle rectangle = new MovableRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
        System.out.println("Создан прямоугольник:\n" + rectangle);

        int cmd = 1;
        while (cmd != 0) {
            System.out.println("\n0 - Exit\t1 - MoveUp\t2 - MoveDown\t3 - MoveLeft\t4 - MoveRight");
            System.out.print("Введите команду: ");
            cmd = scanner.nextInt();
            switch (cmd) {
                default:
                    break;
                case 1:
                    rectangle.moveUp();
                    System.out.println(rectangle);
                    break;
                case 2:
                    rectangle.moveDown();
                    System.out.println(rectangle);
                    break;
                case 3:
                    rectangle.moveLeft();
                    System.out.println(rectangle);
                    break;
                case 4:
                    rectangle.moveRight();
                    System.out.println(rectangle);
                    break;
            }
        }
    }
}
