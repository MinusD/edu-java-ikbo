package ru.minusd.zakatov.lab06.task11;

import java.util.Scanner;

public class TestTemperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature system (1 - fahrenheit, 2 - celsius, 3 - kelvin): ");
        int temp = in.nextInt();

        System.out.print("Enter value: ");
        int value = in.nextInt();

        Temperature temperature = switch (temp) {
            case 1 -> new FahrenheitTemperature(value);
            case 2 -> new CelsiusTemperature(value);
            case 3 -> new KelvinTemperature(value);
            default -> null;
        };

        for (var tt : TemperatureType.values()) {
            System.out.println(tt.toString() + ": " + temperature.convert(tt));
        }
    }
}
