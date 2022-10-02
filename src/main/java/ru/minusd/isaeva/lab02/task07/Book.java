package ru.minusd.isaeva.lab02.task07;

public class Book {
    String title;
    String author;
    int year;
    public Book (String title, String author, int year) {
        setAuthor(author);
        setTitle(title);
        setYear(year);
    }
    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
