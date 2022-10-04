package ru.minusd.bajdak.lab02.task07;

public class Tester {
    public static void main(String[] args) {
        var book1 = new Book("Андрей", "Поросятки", 2021);
        var book2 = new Book("Вася", "Поросятки 2", 2022);
        var book3 = new Book("Надежда", "Одежда", 1998);
        System.out.println(book1.getAuthor());
        System.out.println(book1.getName());
        System.out.println(book1.getYear());

        var bookShelf = new BookShelf();
        bookShelf.add(book1, book2, book3);
        System.out.println(bookShelf);
        bookShelf.sortBooks();
        System.out.println(bookShelf);
    }
}
