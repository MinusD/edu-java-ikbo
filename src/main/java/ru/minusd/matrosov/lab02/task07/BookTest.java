package lab02.task07;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookShelf bs = new BookShelf(new ArrayList<>());

        System.out.print("Добавьте книги. Сколько книг? ");
        bs.amount = scanner.nextInt();


        for (int i = 0; i < bs.amount; i++) {

            System.out.print("Введите автора " + (i+1) + " книги: ");
            String author = scanner.next();

            System.out.print("Введите название " + (i+1) + " книги: ");
            String name = scanner.next();

            System.out.print("Введите год издания " + (i+1) + " книги: ");
            int year = scanner.nextInt();

            bs.books.add(new Book(author, name, year));
        }

        for (Book b : bs.books) {
            System.out.println(b.toString());
        }
        System.out.println();

        System.out.println("Найдем самую раннюю и самую позднюю по году издательства книги: ");
        System.out.println("Самая ранняя - " + bs.firstAndLast(bs.books).get(1).getName() + ", самая поздняя - " + bs.firstAndLast(bs.books).get(0).getName());

        System.out.println();
        System.out.println("Все книги в порядке возрастания года издательства: ");

        bs.sort(bs.books);

        for (Book b : bs.books) {
            System.out.println(b.getName());
        }



    }
}
