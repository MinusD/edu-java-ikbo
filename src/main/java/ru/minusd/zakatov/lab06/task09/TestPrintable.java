package ru.minusd.zakatov.lab06.task09;

import ru.minusd.zakatov.lab06.task06.Printable;
import ru.minusd.zakatov.lab06.task07.Book;
import ru.minusd.zakatov.lab06.task08.Shop;

import java.util.ArrayList;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        List<Printable> list = new ArrayList<>();
        list.add(new Book("1984", "Orwell"));
        list.add(new Book("Romeo and Juliet", "Shakespeare"));
        list.add(new Shop("Vegs", 50));
        list.add(new Shop("Technic", 1000));

        for (var p : list) {
            p.print();
        }
    }
}
