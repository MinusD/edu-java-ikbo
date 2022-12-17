package ru.minusd.vasiliev.lab03.task2;

public class Shop {
    public static void main(String[] args) {
        double amount = 1000;
        Currency from = new Rubles();
        Currency to = new Dollars();
        double result = Converter.convert(amount, from, to);
        System.out.println(amount + " " + from.getName() + " = " + result + " " + to.getName());
    }
}
