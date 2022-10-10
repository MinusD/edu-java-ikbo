package ru.minusd.zakatov.lab06.task03;

public class Planet implements Nameable {
    private final String name;
    private final int radius;

    public Planet(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }
}
