package ru.minusd.zakatov.lab23.task3;

public class Const implements Expression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int var) {
        return value;
    }
}
