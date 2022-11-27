package ru.minusd.vasiliev.lab23.task3.operations;

import ru.minusd.vasiliev.lab23.task3.values.Value;

public class Multiply extends BinaryOperation {
    public Multiply(Value left, Value right) {
        super(left, right);
    }

    public double evaluate(double var) {
        return getLeft().evaluate(var) * getRight().evaluate(var);
    }
}
