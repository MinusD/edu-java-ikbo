package ru.minusd.zakatov.lab07.task07;

import ru.minusd.zakatov.lab07.task06.Magazine;
import ru.minusd.zakatov.lab07.task06.Printable;

import java.util.List;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Book: " + name);
    }

    static void printBooks(List<Printable> printables) {
        for (var p : printables) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
