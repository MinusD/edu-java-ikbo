package ru.minusd.bulgakova.lab03.task07;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input number of book: ");
        int cnt = console.nextInt();
        Bookshelf books = new Bookshelf(cnt);
        System.out.println("Min: "+books.minAgeBook().author+ " "+books.minAgeBook().name +" "+books.minAgeBook().age);
        System.out.println("Max: "+books.maxAgeBook().author+ " "+books.maxAgeBook().name +" "+books.maxAgeBook().age);
        System.out.println("Before sort: ");
        books.printBooks();
        books.sortBooks();
        System.out.println("After sort: ");
        books.printBooks();

    }
}

