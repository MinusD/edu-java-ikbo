package ru.minusd.vasiliev.lab06.task6789;

public class Test {
    public static void main(String[] args) {
        Printable[] printable = {
                new Shop("afafafa"),
                new Book("bbbbbbbbb"),
                new Shop("emqwkemqwklrmqw"),
                new Book("amfklawmlqkm")
        };
        for (Printable p: printable) {
            p.print();
        }
    }
}
