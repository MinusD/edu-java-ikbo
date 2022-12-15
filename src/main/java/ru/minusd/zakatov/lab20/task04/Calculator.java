package ru.minusd.zakatov.lab20.task04;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a1, T a2) {
        return a1.doubleValue() + a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a1, T a2) {
        return a1.doubleValue() * a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a1, T a2) {
        return a1.doubleValue() / a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a1, T a2) {
        return a1.doubleValue() - a2.doubleValue();
    }
}