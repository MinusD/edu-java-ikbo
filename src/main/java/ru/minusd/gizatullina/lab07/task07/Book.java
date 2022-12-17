package ru.minusd.gizatullina.lab07.task07;

public class Book implements Printable {
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("<< " + title + " >> " + author + ", " + year);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Book)
                element.print();
        }
    }
}
