package ru.minusd.gizatullina.lab06.task07;

public class Main {
    public static void main(String[] args) {
        Printable shop = new Shop(500, "Magnit");
        Printable book = new Book("Many problems", "Petr Ilin", 1878);
        shop.print();
        book.print();
    }
}
