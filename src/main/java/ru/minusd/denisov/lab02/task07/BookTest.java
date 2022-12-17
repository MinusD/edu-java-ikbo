package ru.minusd.denisov.lab02.task07;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Автор Авторович", "Книга 2.0", 2007);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год издания: " + book.getYear());

        book.setAuthor("Просто Автор");
        book.setTitle("Книга 3.0");
        book.setYear(2015);

        System.out.println("\nАвтор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год издания: " + book.getYear());

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(new Book("Зорина Н.В.", "Объектно-ориентированный анализ и программирование", 2019));
        bookshelf.add(new Book("Хорстманн, К.", "Java 2. Библиотека профессионала. Том 1. Основы", 2019));
        bookshelf.add(new Book("Хорстманн Кей С.", " Java SE 9. Базовый курс", 2018));
        bookshelf.add(new Book("Докс Оракл Доткомович", "Спецификация языка Java 8", 2021));

        System.out.println("\nКниги на полке...");
        bookshelf.printAll();

        System.out.print("\nКнига на полке с самым ранним годом издания: ");
        System.out.println(bookshelf.getEarliest());

        System.out.print("\nКнига на полке с самым поздним годом издания: ");
        System.out.println(bookshelf.getLatest());

        bookshelf.sortByYear();
        System.out.println("\nОтсортированные в порядке возрастания года издания...");
        bookshelf.printAll();
    }
}
