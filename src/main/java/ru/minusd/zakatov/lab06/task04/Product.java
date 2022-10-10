package ru.minusd.zakatov.lab06.task04;

public class Product implements Priceable {
    private final int price;
    private final String name;
    private final int count;

    public Product(int price, String name, int count) {
        this.price = price;
        this.name = name;
        this.count = count;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
