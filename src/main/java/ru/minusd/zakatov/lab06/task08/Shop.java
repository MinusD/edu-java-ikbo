package ru.minusd.zakatov.lab06.task08;

import ru.minusd.zakatov.lab06.task06.Printable;

public class Shop implements Printable {
    private String name;
    private int goodCount;

    public Shop(String name, int goodCount) {
        this.name = name;
        this.goodCount = goodCount;
    }

    public String getName() {
        return name;
    }

    public int getGoodCount() {
        return goodCount;
    }

    @Override
    public void print() {
        System.out.println("Shop {name=" + name + ", goodCount=" + goodCount + "}");
    }
}
