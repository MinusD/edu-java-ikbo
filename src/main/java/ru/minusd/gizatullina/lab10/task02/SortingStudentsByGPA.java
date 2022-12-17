package ru.minusd.gizatullina.lab10.task02;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student m, Student n) {
        return m.getGpa().compareTo(n.getGpa());
    }
}