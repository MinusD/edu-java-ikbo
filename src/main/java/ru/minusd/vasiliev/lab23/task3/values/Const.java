package ru.minusd.vasiliev.lab23.task3.values;

public class Const implements Value {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    public double evaluate(double var) {
        return value;
    }
}
