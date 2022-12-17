package ru.minusd.bajdak.lab02.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BookShelf {
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public int getSize() {
        return books.size();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book... book) {
        books.addAll(Arrays.asList(book));
    }

    public void sortBooks() {
        books = books.stream().sorted(Comparator.comparingInt(Book::getYear)).collect(Collectors.toList());
    }


    @Override
    public String toString() {
        return "BoolShelf{" +
                "books=" + books +
                ", size=" + getSize() +
                '}';
    }
}
