package ru.minusd.zakatov.lab23.task3;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int var) {
        return var;
    }
}
