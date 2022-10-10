package ru.minusd.kuznetsov.lab03.task01;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Pushkin Aleksandr", "pushkin@ya.ru", 'M');
        Author author2 = new Author("Joanne Rowling", "", 'F');

        System.out.println(author1.getName());
        author2.setEmail("j.row@gmail.com");
        System.out.println(author2.toString());
    }
}
