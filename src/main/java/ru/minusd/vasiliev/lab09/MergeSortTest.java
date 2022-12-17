package ru.minusd.vasiliev.lab09;

import java.util.Random;

public class MergeSortTest {
    public static void main(String[] args) {
        var sorter = new MergeSort();
        var rand = new Random();
        var students1 = new Student[10];
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student("Student", rand.nextInt(50), rand.nextInt(100));
        }
        var students2 = new Student[10];
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student("Student", rand.nextInt(50), rand.nextInt(100));
        }
        var students = sorter.merge(students1, students2);
        sorter.mergeSort(students, 0, students.length - 1);
        for (var stud : students) {
            System.out.println(stud);
        }
    }
}
