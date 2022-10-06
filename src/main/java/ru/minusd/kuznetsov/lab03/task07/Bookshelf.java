package ru.minusd.kuznetsov.lab03.task07;

import java.util.ArrayList;
import java.util.Collections;

public class Bookshelf {
    private ArrayList<Book> bookshelf = new ArrayList<Book>();

    public Bookshelf() {
    }

    public void addBook(Book b) {
        bookshelf.add(b);
        Collections.sort(bookshelf);
    }

    public Book getBookWithEarliestEdition() {
        if (bookshelf.size()>0)
            return bookshelf.get(0);
        else
            return null;
    }
    public Book getBookWithLatestEdition() {
        if (bookshelf.size()>0)
            return bookshelf.get(bookshelf.size()-1);
        else
            return null;
    }

    public ArrayList<Book> getBookshelf() {
        return bookshelf;
    }
}
