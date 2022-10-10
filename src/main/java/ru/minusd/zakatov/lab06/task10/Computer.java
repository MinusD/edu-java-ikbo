package ru.minusd.zakatov.lab06.task10;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", price=" + price +
                '}';
    }
}
