package ru.minusd.vasiliev.lab06.task6789;

public class Shop implements Printable {
    private final String content;

    public Shop(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
