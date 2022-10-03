package ru.minusd.gizatullina.lab06.task04;

public class Cake implements Priceable{
    private int price;

    public Cake(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
