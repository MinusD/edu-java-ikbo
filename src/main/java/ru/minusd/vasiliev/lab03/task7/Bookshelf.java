package ru.minusd.vasiliev.lab03.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int count){
        books = new Book[count];
        this.count = count;
    }

    public void addBook(String author, String name, int year){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null) {
                books[i] = new Book(author, name, year);
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Bookshelf is full");
    }

    public Book[] oldestBooks() {
        int min = Integer.MAX_VALUE;
        var result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYear() == min) {
                result.add(book);
            } else if (book.getYear() < min) {
                result.clear();
                min = book.getYear();
                result.add(book);
            }
        }
        return result.toArray(new Book[result.size()]);
    }

    public Book[] newestBooks() {
        int max = Integer.MIN_VALUE;
        var result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYear() == max) {
                result.add(book);
            } else if (book.getYear() > max) {
                result.clear();
                max = book.getYear();
                result.add(book);
            }
        }
        return result.toArray(new Book[result.size()]);
    }

    public void sortBooks() {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        });
    }

    public Book[] getBooks() {
        return books;
    }
}
