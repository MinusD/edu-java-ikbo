package ru.minusd.poplavskij.lab02.task04;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{" + "name='" + name + '\'' + '}';
    }
}
