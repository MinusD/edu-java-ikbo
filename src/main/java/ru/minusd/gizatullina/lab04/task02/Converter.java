package ru.minusd.gizatullina.lab04.task02;

public class Converter {
    public static double convert(double amount, Currency from, Currency to) {
        return amount * from.getRate() / to.getRate();
    }
}
