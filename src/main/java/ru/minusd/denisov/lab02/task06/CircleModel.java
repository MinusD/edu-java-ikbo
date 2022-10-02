package ru.minusd.denisov.lab02.task06;

import ru.minusd.denisov.lab02.task03.Circle;
import ru.minusd.denisov.lab02.task03.Point;

public class CircleModel extends Circle {
    public CircleModel(Point center, double r) {
        super(center, r);
    }

    public CircleModel(double x, double y, double r) {
        super(x, y, r);
    }

    public double getArea() {
        return Math.PI * getR() * getR();
    }

    public double getCircumferenceLength() {
        return 2 * Math.PI * getR();
    }

    public boolean equals(CircleModel anotherCircle) {
        return getR() == anotherCircle.getR();
    }
}
