package ru.minusd.vasiliev.lab10;

public class ComparableExample implements Comparable<ComparableExample> {
    private final int number;

    public ComparableExample(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(ComparableExample o) {
        return Integer.compare(getNumber(), o.getNumber());
    }
}
