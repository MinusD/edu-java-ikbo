package ru.minusd.gizatullina.lab03.task07;

public class Book {
    private String author;
    private int age;
    private String name;

    public Book(String author, int age, String name) {
        this.author = author;
        this.age = age;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
