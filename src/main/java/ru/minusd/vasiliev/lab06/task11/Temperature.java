package ru.minusd.vasiliev.lab06.task11;

public class Temperature implements Convertable{
    private double temperature;
    private boolean isCelsius = true;

    public Temperature(double temp) {
        this.temperature = temp;
    }

    public void convert() {
        if (isCelsius) {
            temperature = temperature * (9f/5f) + 32;
        } else {
            temperature = (temperature - 32) * (5f/9f);
        }
        isCelsius = !isCelsius;
    }

    public double getTemperature() {
        return temperature;
    }
}
