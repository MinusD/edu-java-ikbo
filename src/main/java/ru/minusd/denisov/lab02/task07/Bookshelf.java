package ru.minusd.denisov.lab02.task07;

import java.util.ArrayList;
import java.util.Comparator;

public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void add(Book newBook) {
        books.add(newBook);
    }

    public Book getEarliest() {
        return books.stream().min(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public Book getLatest() {
        return books.stream().max(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public void printAll() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
