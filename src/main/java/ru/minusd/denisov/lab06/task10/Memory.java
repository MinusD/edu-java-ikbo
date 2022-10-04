package ru.minusd.denisov.lab06.task10;

import ru.minusd.denisov.lab06.task04.Priceable;
import ru.minusd.denisov.lab06.task06.Printable;

public class Memory implements Priceable, Printable {
    private String name;
    private int capacity;
    private int price;

    public Memory(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Оперативная память " + name + " " + capacity + " Гб");
    }
}
