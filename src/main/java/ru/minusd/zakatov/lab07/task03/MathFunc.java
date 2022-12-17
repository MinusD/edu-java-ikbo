package ru.minusd.zakatov.lab07.task03;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double a, double n) {
        return Math.pow(a, n);
    }

    @Override
    public double absOfComplex(double re, double img) {
        return Math.sqrt(pow(re, 2) + pow(img, 2));
    }
}
