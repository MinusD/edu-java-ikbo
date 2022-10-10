package ru.minusd.poplavskij.lab02.task01;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Pushkin", "pushkin@email.ru", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setEmail("pushkin3@email.ru");
        System.out.println(author);
    }
}
