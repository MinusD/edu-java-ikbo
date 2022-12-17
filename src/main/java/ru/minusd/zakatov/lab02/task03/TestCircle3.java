package ru.minusd.zakatov.lab02.task03;

public class TestCircle3 {
    public static void main(String[] args) {
        int size = 3;
        Circle[] circles = new Circle[] {
            new Circle(new Point(4, 5.4), 2),
            new Circle(new Point(3, 0), 20),
            new Circle(new Point(3.5, 1.5), 25)
        };

        System.out.println("Начальное состояние: ");
        for (int i = 0; i < size; i++) {
            System.out.println(circles[i]);
        }

        System.out.println("Изменение поля x поля point у circles[1]: ");
        circles[1].getCenter().setX(100);
        System.out.println(circles[1]);

        System.out.println("\nИзмненение поля radius у circles[2]: ");
        circles[2].setRadius(250);
        System.out.println("Get radius: " + circles[2].getRadius());

        System.out.println("\nКонечное состояние: ");
        for (int i = 0; i < size; i++) {
            System.out.println(circles[i]);
        }
    }
}
