package ru.minusd.vasiliev.lab06.task10;

public class Memory {
    private int frequency;
    private String name;
    private int price;

    public Memory(int frequency, String name, int price) {
        this.frequency = frequency;
        this.name = name;
        this.price = price;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
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
        return "Memory{" +
                "frequency=" + frequency +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
