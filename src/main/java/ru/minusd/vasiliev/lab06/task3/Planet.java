package ru.minusd.vasiliev.lab06.task3;

public class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Планета под названием " + name;
    }
}
