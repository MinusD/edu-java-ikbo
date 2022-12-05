package ru.minusd.zakatov.lab23.task3;

public class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int var) {
        return left.evaluate(var) + right.evaluate(var);
    }
}
