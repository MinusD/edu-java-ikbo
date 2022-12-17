package ru.minusd.denisov.lab06.task09;

import ru.minusd.denisov.lab06.task06.Printable;
import ru.minusd.denisov.lab06.task07.Book;
import ru.minusd.denisov.lab06.task08.Magazine;

public class TestPrintableObjects {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Book("Война и мир", "Лев Толстой", 1869);
        printables[1] = new Book("Преступление и наказание", "Федор Достоевский", 1866);
        printables[2] = new Magazine("Компьютерный журнал");

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
