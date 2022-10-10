package ru.minusd.marov.lab03.task07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] warehouse = new Book[3];
        Bookshelf obj1 = new Bookshelf(3);
        String currentName;
        String currentAuthor;
        int currentYear;
        for (int i = 0; i < warehouse.length; i++) {
            System.out.println("enter " + (i + 1) + " author");
            currentAuthor = sc.nextLine();
            System.out.println("enter " + (i + 1) + " name");
            currentName = sc.nextLine();
            System.out.println("enter " + (i + 1) + " year");
            currentYear = sc.nextInt();
            warehouse[i] = new Book(currentAuthor, currentName, currentYear);
            sc.nextLine();
        }
        obj1.setWarehouse(warehouse);
        obj1.sort_by_year();
        obj1.print();
        obj1.maxYear();
        obj1.minYear();
    }
}
