package ru.minusd.denisov.lab06.task10;

import ru.minusd.denisov.lab06.task04.Priceable;
import ru.minusd.denisov.lab06.task06.Printable;

public class Computer implements Priceable, Printable {
    private ComputerBrand brand;
    private String name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, String name, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return processor.getPrice() + memory.getPrice() + monitor.getPrice();
    }

    @Override
    public void print() {
        System.out.println("Компьютер " + name + " от " + brand + " с ценой " + getPrice());
        processor.print();
        memory.print();
        monitor.print();
    }
}
