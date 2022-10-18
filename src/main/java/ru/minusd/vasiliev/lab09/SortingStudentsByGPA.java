package ru.minusd.vasiliev.lab09;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAverage(), o2.getAverage()) * -1;
    }

    public void sortStudentsQuicksort(Student[] students, int start, int end) {
        if (start >= end) return;
        var pivot = students[end-1];
        var index = start;
        for (int i = start; i <= end && i < students.length; i++) {
            if (compare(students[i], pivot) < 0) {
                var temp = students[i];
                students[i] = students[index];
                students[index] = temp;
                index++;
            }
        }
        var temp = students[index];
        students[index] = students[end-1];
        students[end-1] = temp;

        sortStudentsQuicksort(students, start, index);
        sortStudentsQuicksort(students, index+1, end);
    }
}
