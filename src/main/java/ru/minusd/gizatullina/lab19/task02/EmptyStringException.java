package ru.minusd.gizatullina.lab19.task02;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}