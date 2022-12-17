package ru.minusd.zakatov.lab09.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Enter id, name, age, gpa: ");
            Student student = new Student(in.nextInt(), in.next(), in.nextInt(), in.nextInt());
            students.add(student);
        }

        sort(students);
        System.out.println("Sorted students: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + students.get(i));
        }
    }

    public static void sort(List<Student> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Student x = arr.get(i);
            int j = i;
            while (j > 0 && arr.get(j - 1).getId() > x.getId()) {
                arr.set(i, arr.get(i - 1));
                --j;
            }
            arr.set(j, x);
        }
    }

    public static <T extends Comparable<T>> void insertionSort(List<T> arr) {
        for (int i = 1; i < arr.size(); i++) {
            T x = arr.get(i);
            int j = i;
            while (j > 0 && arr.get(j - 1).compareTo(x) > 0) {
                arr.set(i, arr.get(i - 1));
                --j;
            }
            arr.set(j, x);
        }
    }
}
