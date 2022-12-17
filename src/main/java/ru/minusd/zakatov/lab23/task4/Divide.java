package ru.minusd.zakatov.lab23.task4;

public class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int... vars) {
        return left.evaluate(vars) / right.evaluate(vars);
    }

    @Override
    public String toString() {
        return String.format("(%s / %s)", left, right);
    }
}
