package ru.minusd.denisov.lab02.task03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Circle> circles = new ArrayList<>();
        System.out.print("Количество окружностей: ");
        int n = scanner.nextInt();

        System.out.println("Задайте " + n + " окружностей. Формат x, y, r");
        double x, y, r;
        for (int i = 0; i < n; i++) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            r = scanner.nextDouble();

            circles.add(new Circle(x, y, r));
        }

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
