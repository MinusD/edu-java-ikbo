package ru.minusd.zakatov.lab23.task4;

public class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int... vars) {
        return Math.multiplyExact(left.evaluate(vars), right.evaluate(vars));
    }

    @Override
    public String toString() {
        return String.format("(%s * %s)", left, right);
    }
}
