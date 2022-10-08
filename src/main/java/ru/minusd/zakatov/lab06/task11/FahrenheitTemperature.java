package ru.minusd.zakatov.lab06.task11;

public class FahrenheitTemperature extends Temperature {
    public FahrenheitTemperature(double value) {
        super(value);
    }

    @Override
    public Temperature convert(TemperatureType type) {
        return switch (type) {
            case KELVIN -> new KelvinTemperature((value - 32) * (5.0 / 9) + 273);
            case CELSIUS -> new CelsiusTemperature((value - 32) * (5.0 / 9));
            default -> this;
        };
    }
}
