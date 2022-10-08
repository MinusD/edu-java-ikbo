package ru.minusd.zakatov.lab06.task11;

public abstract class Temperature implements Convertable {
    protected double value;

    public Temperature(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  getClass().getName() + "{" +
                "value=" + value +
                '}';
    }
}
