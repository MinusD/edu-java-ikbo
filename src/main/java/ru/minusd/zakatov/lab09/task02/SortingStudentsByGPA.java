package ru.minusd.zakatov.lab09.task02;

import ru.minusd.zakatov.lab09.task01.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGpa(), o2.getGpa());
    }
}
