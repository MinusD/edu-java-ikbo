package ru.minusd.vasiliev.lab18.task01;

public class Exception1 {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
