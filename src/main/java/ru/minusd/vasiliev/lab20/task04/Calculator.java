package ru.minusd.vasiliev.lab20.task04;

public class Calculator {
    public static <T1 extends Number, T2 extends Number> double sum(T1 a, T2 b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double sub(T1 a, T2 b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double mul(T1 a, T2 b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> double div(T1 a, T2 b) {
        return a.doubleValue() / b.doubleValue();
    }
}
