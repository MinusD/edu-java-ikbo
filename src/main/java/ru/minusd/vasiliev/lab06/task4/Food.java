package ru.minusd.vasiliev.lab06.task4;

public class Food implements Priceable{
    private final int price;

    public Food(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
