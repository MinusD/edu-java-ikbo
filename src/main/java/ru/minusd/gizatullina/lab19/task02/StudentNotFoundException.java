package ru.minusd.gizatullina.lab19.task02;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Student not found");
    }
}
