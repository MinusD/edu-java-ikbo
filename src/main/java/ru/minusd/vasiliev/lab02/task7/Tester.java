package ru.minusd.vasiliev.lab02.task7;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        var bookshelf = new Bookshelf(count);
        for (int i = 0; i < count; i++){
            System.out.print("Автор: ");
            String name = scanner.next();
            System.out.print("Название: ");
            String author = scanner.next();
            System.out.print("Год выпуска: ");
            int year = scanner.nextInt();
            bookshelf.addBook(author, name, year);
        }
        for (Book book: bookshelf.oldestBooks()) {
            System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        }
        for (Book book: bookshelf.newestBooks()) {
            System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        }
        bookshelf.sortBooks();
        for (Book book: bookshelf.getBooks()) {
            System.out.println(book.getAuthor() + " " + book.getName() + " " + book.getYear());
        }
    }
}
