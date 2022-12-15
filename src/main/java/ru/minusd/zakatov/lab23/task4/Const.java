package ru.minusd.zakatov.lab23.task4;

public class Const implements Expression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int... vars) {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
