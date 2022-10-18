package ru.minusd.vasiliev.lab07.task78;

public class Book implements Printable {
    private final String content;

    public Book(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Содержимое книги: " + content);
    }

    public static void printBooks(Printable[] printables) {
        for (var printable: printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}

