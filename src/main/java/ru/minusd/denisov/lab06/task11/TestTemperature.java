package ru.minusd.denisov.lab06.task11;

import java.util.Scanner;

public class TestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        Convertable temperature = new Temperature(scanner.nextDouble());

        System.out.println("Температура в градусах Цельсия: " + temperature.inCelcius() + " °C");
        System.out.println("Температура в Кельвинах: " + temperature.inKelvin() + " K");
        System.out.println("Температура в градусах Фаренгейта: " + temperature.inFahrenheit() + " °F");
    }
}
