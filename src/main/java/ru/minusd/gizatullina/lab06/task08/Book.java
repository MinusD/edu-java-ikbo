package ru.minusd.gizatullina.lab06.task08;

public class Book implements Printable {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Book: <<"+title+">> - "+ author + ", " + year);
    }
}
