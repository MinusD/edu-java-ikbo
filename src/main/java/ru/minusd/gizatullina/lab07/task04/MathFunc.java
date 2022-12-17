package ru.minusd.gizatullina.lab07.task04;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, int n) {
        double temp = x;
        for (int i = 0; i < n - 1; i++) {
            x *= temp;
        }
        return x;
    }

    @Override
    public double complexM(double m, double md) {
        return Math.sqrt(pow(m, 2) + pow(md, 2));
    }
}