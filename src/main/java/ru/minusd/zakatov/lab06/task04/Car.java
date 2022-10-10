package ru.minusd.zakatov.lab06.task04;

public class Car implements Priceable {
    private final int price;
    private final String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
