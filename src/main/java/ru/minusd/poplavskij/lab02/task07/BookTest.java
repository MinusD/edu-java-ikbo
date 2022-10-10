package ru.minusd.poplavskij.lab02.task07;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество книг:");
        int count = scanner.nextInt();
        System.out.println("Введите название, автора и год публикации книг: ");
        for (int i = 0; i < count; i++) {
            String title = scanner.next();
            String author = scanner.next();
            int year = scanner.nextInt();
            bookShelf.books.add(new Book(title, author, year));
        }
        ArrayList<Book> lastandfirst = bookShelf.getFirstAndLast();
        System.out.println(lastandfirst.get(0));
        System.out.println(lastandfirst.get(1));
    }
}
