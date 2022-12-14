package ru.minusd.vasiliev.lab03.task2;

public class Converter {
    public static double convert(double amount, Currency from, Currency to) {
        return amount * from.getRate() / to.getRate();
    }
}
