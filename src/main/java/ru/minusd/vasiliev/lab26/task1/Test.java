package ru.minusd.vasiliev.lab26.task1;

public class Test {
    public static void main(String[] args) {
        var hashtab = new Hashtab();
        hashtab.add("Hello");
        hashtab.add("World");
        hashtab.add("!");
        System.out.println(hashtab.find("Hello"));
        System.out.println(hashtab.find("World"));
        System.out.println(hashtab.find("!"));
        System.out.println(hashtab.find("Java"));
        hashtab.delete("Hello");
        System.out.println(hashtab.find("Hello"));
    }
}
