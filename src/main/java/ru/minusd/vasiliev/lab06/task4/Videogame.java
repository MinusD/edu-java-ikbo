package ru.minusd.vasiliev.lab06.task4;

public class Videogame implements Priceable{
    private final int price;

    public Videogame(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
