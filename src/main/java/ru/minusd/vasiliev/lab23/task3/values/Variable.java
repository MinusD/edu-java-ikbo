package ru.minusd.vasiliev.lab23.task3.values;

public class Variable implements Value {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double evaluate(double value) {
        return value;
    }
}
