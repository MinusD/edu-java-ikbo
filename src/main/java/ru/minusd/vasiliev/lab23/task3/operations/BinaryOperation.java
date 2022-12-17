package ru.minusd.vasiliev.lab23.task3.operations;

import ru.minusd.vasiliev.lab23.task3.values.Value;

public abstract class BinaryOperation implements Value {
    private Value left;
    private Value right;

    public BinaryOperation(Value left, Value right) {
        this.left = left;
        this.right = right;
    }

    public Value getLeft() {
        return left;
    }

    public Value getRight() {
        return right;
    }

    public abstract double evaluate(double var);
}
