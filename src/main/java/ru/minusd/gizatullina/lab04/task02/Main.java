package ru.minusd.gizatullina.lab04.task02;

public class Main {
    public static void main(String[] args) {
        double amount = 500;
        Currency from = new Rubles();
        Currency to = new Dollars();
        double result = Converter.convert(amount, from, to);
        System.out.println(amount + " " + from.getName() + " = " + result + " " + to.getName());
    }
}
