package ru.minusd.vasiliev.lab18.task07;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
