package ru.minusd.zakatov.lab02.task07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookShelf {
    private final List<Book> books;

    BookShelf(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getMaxYear() {
        Book maxBook = books.get(0);

        for (int i = 1; i < books.size(); i++) {
            if (maxBook.getYear() < books.get(i).getYear()) {
                maxBook = books.get(i);
            }
        }

        return maxBook;
    }

    public Book getMinYear() {
        Book minYear = books.get(0);

        for (int i = 1; i < books.size(); i++) {
            if (minYear.getYear() > books.get(i).getYear()) {
                minYear = books.get(i);
            }
        }

        return minYear;
    }

    public BookShelf getSortedBookShelf() {
        BookShelf bookShelf = new BookShelf(books);
        bookShelf.getBooks().sort(Comparator.comparing(Book::getYear));
        return bookShelf;
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
