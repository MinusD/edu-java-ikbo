package ru.minusd.vasiliev.lab09;

import java.util.Random;

public class TestInsertionSort {
    public static void main(String[] args) {
        var rand = new Random();
        var students = new Student[50];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student", rand.nextInt(1000), rand.nextInt(6));
        }
        insertionSort(students);
        for (var stud :
                students) {
            System.out.println(stud);
        }
    }

    private static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (students[j].getId() < students[j-1].getId()) {
                    Student temp = students[j];
                    students[j] = students[j-1];
                    students[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
