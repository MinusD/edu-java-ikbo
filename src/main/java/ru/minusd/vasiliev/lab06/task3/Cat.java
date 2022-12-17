package ru.minusd.vasiliev.lab06.task3;

public class Cat implements Nameable {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Кот по имени " + name;
    }
}
