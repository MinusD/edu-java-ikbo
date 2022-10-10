package ru.minusd.zakatov.lab06.task11;

public class KelvinTemperature extends Temperature {
    public KelvinTemperature(double value) {
        super(value);
    }

    @Override
    public Temperature convert(TemperatureType type) {
        return switch (type) {
            case CELSIUS -> new CelsiusTemperature(value - 273);
            case FAHRENHEIT -> new FahrenheitTemperature((value - 273) * (9.0 / 5) + 32);
            default -> this;
        };
    }
}
