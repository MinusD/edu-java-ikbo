package ru.minusd.gizatullina.lab06.task10;

public class Monitor {
    private int diagonal;
    private int frequency;

    public Monitor(int diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", frequency=" + frequency +
                '}';
    }
}
