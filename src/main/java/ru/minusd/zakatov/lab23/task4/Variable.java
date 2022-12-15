package ru.minusd.zakatov.lab23.task4;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int... vars) {
        return switch (name) {
            case "y" -> vars[1];
            case "z" -> vars[2];
            default -> vars[0];
        };
    }

    @Override
    public String toString() {
        return name;
    }
}
