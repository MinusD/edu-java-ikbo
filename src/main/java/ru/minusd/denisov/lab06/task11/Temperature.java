package ru.minusd.denisov.lab06.task11;

public class Temperature implements Convertable {
    double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double inCelcius() {
        return celsius;
    }

    @Override
    public double inKelvin() {
        return celsius + 273.15;
    }

    @Override
    public double inFahrenheit() {
        return celsius * 1.8 + 32;
    }
}
