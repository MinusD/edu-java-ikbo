package ru.minusd.zakatov.lab09.task02;

import ru.minusd.zakatov.lab09.task01.Student;

import java.util.*;

public class TestSortingStudents {
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

        quickSort(students, new SortingStudentsByGPA(), 0, students.size() - 1);
        Collections.reverse(students);
        System.out.println("Sorted students: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + students.get(i));
        }
    }

    public static <T> void quickSort(List<T> arr, Comparator<T> comparator, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        T pivot = arr.get((leftMarker + rightMarker) / 2);
        do {
            while (comparator.compare(arr.get(leftMarker), pivot) < 0) {
                leftMarker++;
            }

            while (comparator.compare(arr.get(rightMarker), pivot) > 0) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    T tmp = arr.get(leftMarker);
                    arr.set(leftMarker, arr.get(rightMarker));
                    arr.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker++;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < right) {
            quickSort(arr, comparator, leftMarker, right);
        }

        if (left < rightMarker) {
            quickSort(arr, comparator, left, rightMarker);
        }
    }
}
