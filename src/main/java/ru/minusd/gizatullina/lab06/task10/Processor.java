package ru.minusd.gizatullina.lab06.task10;

public class Processor {
    private int frequency;
    private int cores;

    public Processor(int frequency, int cores) {
        this.frequency = frequency;
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }
}
