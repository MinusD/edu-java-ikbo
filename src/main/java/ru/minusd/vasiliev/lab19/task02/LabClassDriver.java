package ru.minusd.vasiliev.lab19.task02;

import java.util.Arrays;

public class LabClassDriver {
    public static void main(String[] args) {
        var labClass = new LabClass(Arrays.asList(
                new Student("Иванов", 3),
                new Student("Петров", 4),
                new Student("Сидоров", 5),
                new Student("Алексеев", 2),
                new Student("Александров", 1)
        ));
        var labClassUI = new LabClassUI(labClass);
        labClassUI.findStudent("Алексеев");
        labClassUI.findStudent("");
        labClassUI.findStudent("Жириновский");
        labClassUI.printStudents();
        labClassUI.sortStudents();
        labClassUI.printStudents();
    }
}
