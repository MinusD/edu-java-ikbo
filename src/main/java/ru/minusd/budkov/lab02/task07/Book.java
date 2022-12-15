package ru.minusd.budkov.lab02.task07;

public class Book {
    private String author;
    private String name;
    private int year;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }
}