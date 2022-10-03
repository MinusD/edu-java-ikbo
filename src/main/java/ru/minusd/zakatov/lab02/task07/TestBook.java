package ru.minusd.zakatov.lab02.task07;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Михаил Булгаков", "Мастер и Маргарита", 1923));
        books.add(new Book("Фёдор Достоевский", "Преступление и наказание", 1830));

        BookShelf bookShelf = new BookShelf(books);
        bookShelf.print();

        System.out.println("\nMax year: " + bookShelf.getMaxYear());
        System.out.println("Min year: " + bookShelf.getMinYear());
        BookShelf sortedBookShelf = bookShelf.getSortedBookShelf();
        System.out.println("\nОтсортированная полка: ");
        sortedBookShelf.print();
    }
}
