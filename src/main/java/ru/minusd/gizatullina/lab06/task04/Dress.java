package ru.minusd.gizatullina.lab06.task04;

public class Dress implements Priceable{
    private int price;

    public Dress(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
