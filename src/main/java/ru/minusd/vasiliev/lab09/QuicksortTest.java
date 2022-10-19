package ru.minusd.vasiliev.lab09;

import java.util.Random;
import java.util.ArrayList;

public class QuicksortTest {
    public static void main(String[] args) {
        var rand = new Random();
        var students = new Student[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student", rand.nextInt(1000), rand.nextInt(100));
        }
        var comparator = new SortingStudentsByGPA();
        comparator.sortStudentsQuicksort(students, 0, students.length);
        for (var stud :
                students) {
            System.out.println(stud);
        }
    }
}
