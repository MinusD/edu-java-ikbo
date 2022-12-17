package ru.minusd.zakatov.lab06.task07;

import ru.minusd.zakatov.lab06.task06.Printable;

public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book {name=" + name + ", author=" + author + "}");
    }
}
