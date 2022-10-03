package ru.minusd.gizatullina.lab06.task10;

public class Memory {
    private int capacity;
    private int frequency;

    public Memory(int capacity, int frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                ", frequency=" + frequency +
                '}';
    }
}
