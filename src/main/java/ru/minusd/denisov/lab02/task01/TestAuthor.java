package ru.minusd.denisov.lab02.task01;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, email;
        char gender;

        System.out.print("Имя нового автора: ");
        name = scanner.next();

        System.out.print("Почта: ");
        email = scanner.next();

        System.out.print("Пол (М/Ж): ");
        gender = scanner.next().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.println("Автор: " + author.getName() +
                "\nПочта автора: " + author.getEmail() +
                "\nПол автора: " + author.getGender());

        System.out.print("Измените почту автора: ");
        email = scanner.next();
        author.setEmail(email);

        System.out.println(author);
    }
}
