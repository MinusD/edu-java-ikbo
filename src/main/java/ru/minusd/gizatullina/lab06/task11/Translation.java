package ru.minusd.gizatullina.lab06.task11;

public class Translation implements Convertable {
    private double value;

    public Translation(double value) {
        this.value = value;
    }

    @Override
    public double convertTotFahrenheit() {
        return value * 1.8 + 32;
    }

    @Override
    public double convertToKelvin() {
        return value + 273;
    }
}
