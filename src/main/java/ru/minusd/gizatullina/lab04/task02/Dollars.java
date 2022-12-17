package ru.minusd.gizatullina.lab04.task02;

public class Dollars implements Currency {
    private final double rate = 60;

    @Override
    public String getName() {
        return "USD";
    }

    @Override
    public double getRate() {
        return rate;
    }
}
