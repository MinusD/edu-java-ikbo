package ru.minusd.zakatov.lab06.task10;

public class Processor {
    private String model;
    private double frequency;

    public Processor(String name, double frequency) {
        this.model = name;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
