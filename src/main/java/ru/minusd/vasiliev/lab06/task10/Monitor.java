package ru.minusd.vasiliev.lab06.task10;

public class Monitor {
    private int width;
    private int height;
    private String name;
    private int price;

    public Monitor(int price, String name, int width, int height) {
        this.width = width;
        this.height = height;
        this.name = name;
        this.price = price;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
