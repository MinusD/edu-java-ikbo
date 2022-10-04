package ru.minusd.denisov.lab06.task10;

import ru.minusd.denisov.lab06.task04.Priceable;
import ru.minusd.denisov.lab06.task06.Printable;

public class Monitor implements Priceable, Printable {
    private String name;
    private int diagonal;
    private int price;

    public Monitor(String name, int diagonal, int price) {
        this.name = name;
        this.diagonal = diagonal;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Монитор " + name + " " + diagonal + "''");
    }
}
