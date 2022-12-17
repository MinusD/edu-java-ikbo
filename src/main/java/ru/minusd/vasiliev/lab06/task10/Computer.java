package ru.minusd.vasiliev.lab06.task10;

public class Computer {
    private Manufacturer manufacturer;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;
    private String name;

    public Computer(Manufacturer manufacturer, Memory memory, Monitor monitor, Processor processor, String name) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer=" + manufacturer +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                ", name='" + name + '\'' +
                '}';
    }
}
