package ru.minusd.gizatullina.lab07.task07;

public class Main {
    public static void main(String[] args) {
        Printable[] arr = new Printable[4];
        arr[0] = new Book("Vian Fds", "Hillary Holl", 1987);
        arr[1] = new Magazine("Molly", 1000);
        arr[2] = new Magazine("Kiss", 2500);
        arr[3] = new Book("Dyret", "Aril Fitty", 2001);
        System.out.println("All magazines: ");
        Magazine.printMagazines(arr);
        System.out.println("All books: ");
        Book.printBooks(arr);
    }
}
