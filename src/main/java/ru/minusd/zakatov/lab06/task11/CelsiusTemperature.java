package ru.minusd.zakatov.lab06.task11;

public class CelsiusTemperature extends Temperature {
    public CelsiusTemperature(double value) {
        super(value);
    }

    @Override
    public Temperature convert(TemperatureType type) {
        return switch (type) {
            case KELVIN -> new KelvinTemperature(value + 273);
            case FAHRENHEIT -> new FahrenheitTemperature(value * (9.0 / 5) + 32);
            default -> this;
        };
    }
}
