package ru.minusd.denisov.lab02.task04;

public class Computer {
    private String name;

    public Computer(String description) {
        this.name = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}
