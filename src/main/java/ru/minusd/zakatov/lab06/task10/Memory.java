package ru.minusd.zakatov.lab06.task10;

public class Memory {
    private String model;
    private double size;

    public Memory(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
