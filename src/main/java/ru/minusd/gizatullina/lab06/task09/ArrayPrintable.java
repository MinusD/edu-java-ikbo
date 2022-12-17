package ru.minusd.gizatullina.lab06.task09;

import java.util.ArrayList;

public class ArrayPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arr = new ArrayList<Printable>();

        Printable book1 = new Book("Magazine", "Shpirit Amer", 1987);
        Printable book2 = new Book("History of Rim", "Chak Polo", 1876);
        Printable book3 = new Book("Secrets of Coco", "Lerua Gik", 2003);

        arr.add(book1);
        arr.add(book2);
        arr.add(book3);

        for (Printable element : arr) {
            element.print();
        }
    }
}
