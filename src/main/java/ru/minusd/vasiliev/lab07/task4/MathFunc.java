package ru.minusd.vasiliev.lab07.task4;

public class MathFunc implements MathCalculable {
    private final double pi = Math.PI;

    @Override
    public double pow(double a, double n) {
        return Math.pow(a, n);
    }

    @Override
    public double complexAbs(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public double getPI() {
        return pi;
    }

    public double circleLength(double r) {
        return 2 * pi * r;
    }
}
