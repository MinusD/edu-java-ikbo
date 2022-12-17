package ru.minusd.denisov.lab02.task06;

public class CircleModelTest {
    public static void main(String[] args) {
        CircleModel circleModel1 = new CircleModel(1, 2, 10);
        CircleModel circleModel2 = new CircleModel(2, 5, 54);

        System.out.println("Площадь круга: " + circleModel1.getArea());
        System.out.println("Длина окружности: " + circleModel1.getCircumferenceLength());

        System.out.println(circleModel1.equals(circleModel2) ? "Окружности равны" : "Окружности разные");
    }
}
