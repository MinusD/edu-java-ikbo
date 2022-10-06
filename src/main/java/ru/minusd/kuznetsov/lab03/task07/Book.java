package ru.minusd.kuznetsov.lab03.task07;

public class Book implements Comparable<Book>{
    private String author = "unknown author";
    private String name = "unknown name";
    private int publication_year = -1;

    public Book() {
    }

    public Book(String author, String name, int publication_year) {
        this.author = author;
        this.name = name;
        this.publication_year = publication_year;
    }

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

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    @Override
    public int compareTo(Book o) {
        return this.getPublication_year() - o.getPublication_year();
    }

    @Override
    public String toString() {
        return "Book '" + name +
                "' by " + author +
                " of the " + publication_year;
    }
}
