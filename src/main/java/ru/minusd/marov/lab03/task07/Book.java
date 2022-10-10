package ru.minusd.marov.lab03.task07;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
