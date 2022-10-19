package ru.minusd.vasiliev.lab06.task6789;

public class Book implements Printable {
    private final String content;

    public Book(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
