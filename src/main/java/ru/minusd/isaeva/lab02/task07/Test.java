package ru.minusd.isaeva.lab02.task07;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество книг");
        int count = in.nextInt();
        String author, title;
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название");
            in.nextLine();
            title = in.nextLine();
            System.out.println("Введите автора");
            author = in.nextLine();
            System.out.println("Введите год выпуска");
            int year = in.nextInt();
            bookshelf.addBook(title, author, year);
        }
        bookshelf.print();
        System.out.println("Самое старая книга" + bookshelf.min().toString());
        System.out.println("Самое новая книга" + bookshelf.max().toString());
        bookshelf.sort();
        bookshelf.print();
    }
}