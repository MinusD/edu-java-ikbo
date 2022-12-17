package ru.minusd.zakatov.lab23.task3;

public class Subtract extends BinaryOperation{
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int var) {
        return left.evaluate(var) - right.evaluate(var);
    }
}
