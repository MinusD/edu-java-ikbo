package ru.minusd.budkov.lab02.task07;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Shelf shelf = new Shelf(new ArrayList<>());
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            String author = scanner.nextLine();
//            String name = scanner.nextLine();
//            int year = scanner.nextInt();
//            scanner.nextLine();
//            shelf.books.add(new Book(author, name, year));
//        }
        shelf.books.add(new Book("author1", "name1", 1900));
        shelf.books.add(new Book("author2", "name2", 1980));
        shelf.books.add(new Book("author3", "name3", 1920));
        shelf.books.add(new Book("author4", "name4", 1960));
        shelf.books.add(new Book("author5", "name5", 1925));
        shelf.books.add(new Book("author6", "name6", 1990));
        shelf.sortShelf();
        for(int i = 0; i < shelf.books.size(); i++){
            System.out.println(shelf.books.get(i).getYear());
        }
    }
}