package ru.minusd.vasiliev.lab03.task2;

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
