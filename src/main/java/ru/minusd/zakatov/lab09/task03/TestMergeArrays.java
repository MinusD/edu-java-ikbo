package ru.minusd.zakatov.lab09.task03;

import ru.minusd.zakatov.lab09.task01.Student;

import java.util.ArrayList;
import java.util.List;

public class TestMergeArrays {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();

        students1.add(new Student(123, "Igor", 19, 100));
        students1.add(new Student(800, "Dima", 19, 120));

        students2.add(new Student(300, "Alla", 20, 80));
        students2.add(new Student(1000, "Nikolai", 0, 0));

        System.out.println("1st array: ");
        for (int i = 0; i < students1.size(); i++) {
            System.out.println((i + 1) + ": " + students1.get(i));
        }

        System.out.println("\n2nd array: ");
        for (int i = 0; i < students2.size(); i++) {
            System.out.println((i + 1) + ": " + students2.get(i));
        }

        System.out.println("\nMerged array: ");
        List<Student> merged = mergeStudents(students1, students2);
        for (int i = 0; i < merged.size(); i++) {
            System.out.println((i + 1) + ": " + merged.get(i));
        }
    }

    public static List<Student> mergeStudents(List<Student> arr1, List<Student> arr2) {
        int len1 = arr1.size();
        int len2 = arr2.size();

        List<Student> merged = new ArrayList<>(len1 + len2);
        int pos1, pos2;
        pos1 = pos2 = 0;

        while (pos1 < len1 && pos2 < len2) {
            if (arr1.get(pos1).compareTo(arr2.get(pos2)) < 0) {
                merged.add(arr1.get(pos1++));
            } else {
                merged.add(arr2.get(pos2++));
            }
        }

        while (pos1 < len1) {
            merged.add(arr1.get(pos1++));
        }

        while (pos2 < len2) {
            merged.add(arr2.get(pos2++));
        }

        return merged;
    }
}
