package ru.minusd.gizatullina.lab04.task02;

public class Rubles implements Currency {
    private final double rate = 1.0;

    @Override
    public String getName() {
        return "RUB";
    }

    @Override
    public double getRate() {
        return rate;
    }
}