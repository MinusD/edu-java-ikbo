package ru.minusd.vasiliev.lab10;

import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator<Student> {
    public static boolean compareByAverage = true;

    @Override
    public int compare(Student o1, Student o2) {
        if (compareByAverage) {
            return Integer.compare(o1.getAverage(), o2.getAverage()) * -1;
        } else {
            return Integer.compare(o1.getId(), o2.getId()) * -1;
        }
    }

    public static void main(String[] args) {
        var iDNumber = new Student[50];
        setArray(iDNumber);
        var sorter = new SortingStudentsByGPA();
        sorter.mergeSort(iDNumber, 0, iDNumber.length-1);
        outArray(iDNumber);
        System.out.println("-------");
        setArray(iDNumber);
        sorter.sortStudentsQuicksort(iDNumber, 0, iDNumber.length - 1);
        outArray(iDNumber);
        System.out.println("-------");
        setArray(iDNumber);
        compareByAverage = false;
        sorter.mergeSort(iDNumber, 0, iDNumber.length - 1);
        outArray(iDNumber);
    }

    public static void setArray(Student[] students) {
        var rand = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student", rand.nextInt(1000), rand.nextInt(100));
        }
    }

    public static void outArray(Student[] students) {
        for (var stud: students) {
            System.out.println(stud);
        }
    }

    public void mergeSort(Student[] arr, int start, int end) {
        if (end - start + 1 <= 1) return;
        mergeSort(arr, start, start + (end-start)/2);
        mergeSort(arr, start + (end-start)/2 + 1, end);
        var startIndex = start;
        var midIndex = start + (end - start) / 2 + 1;
        var result = new Student[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            if (startIndex < start + (end-start) / 2 + 1) {
                if (midIndex <= end) {
                    if (compare(arr[startIndex], arr[midIndex]) > 0) {
                        result[i] = arr[midIndex++];
                        continue;
                    }
                }
                result[i] = arr[startIndex++];
            } else {
                result[i] = arr[midIndex++];
            }
        }
        for (int i = 0; i < result.length; i++) {
            arr[start+i] = result[i];
        }
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
