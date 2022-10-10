package ru.minusd.zakatov.lab06.task10;

public class Monitor {
    private String model;
    private double diagonal;
    private double frequency;

    public Monitor(String model, double diagonal, double frequency) {
        this.model = model;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", frequency=" + frequency +
                '}';
    }
}
