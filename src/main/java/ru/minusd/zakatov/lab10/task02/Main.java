package ru.minusd.zakatov.lab10.task02;

import ru.minusd.zakatov.lab10.task01.Student;

import java.util.*;

public class Main {
    private static Scanner in;
    private static List<Student> iDNumber;

    public static void main(String[] args) {
        iDNumber = new ArrayList<>();
        in = new Scanner(System.in);
        setArray();

        System.out.println("Initial array");
        outArray();

        quickSort(iDNumber, Comparator.comparingInt(s -> -s.getGpa()), 0, iDNumber.size() - 1);

        System.out.println("\nSorted using quick sort by gpa: ");
        outArray();

        mergeSort(iDNumber, Comparator.comparing(Student::getName), 0, iDNumber.size() - 1);
        System.out.println("\nSorted using merge sort by name: ");
        outArray();
    }

    public static void setArray() {
        System.out.print("Enter count of students: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name, course, gpa: ");
            Student student = new Student(in.next(), in.next(), in.nextInt(), in.nextInt());
            iDNumber.add(student);
        }
    }

    public static void outArray() {
        for (int i = 0; i < iDNumber.size(); i++) {
            System.out.println((i + 1) + ": " + iDNumber.get(i));
        }
    }

    public static void quickSort(
            List<Student> students,
            Comparator<Student> comparator,
            int begin,
            int end
    ) {
        if (begin >= end) return;

        Student pivot = students.get(end);
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (comparator.compare(students.get(j), pivot) <= 0) {
                i++;
                Collections.swap(students, i, j);
            }
        }

        Collections.swap(students, ++i, end);
        quickSort(students, comparator, begin, i - 1);
        quickSort(students, comparator, i + 1, end);
    }

    public static void mergeSort(
            List<Student> arr,
            Comparator<Student> comparator,
            int left,
            int right
    ) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, comparator, left, mid);
        mergeSort(arr, comparator, mid + 1, right);
        merge(arr, comparator, left, mid, right);
    }

//    Функция слияния двух отсортированных массивов
    public static void merge(
            List<Student> arr,
            Comparator<Student> comparator,
            int left, int mid, int right
    ) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Student> L = new ArrayList<>();
        List<Student> R = new ArrayList<>();

        for (int i = 0; i < n1; i++)
            L.add(arr.get(left + i));

        for (int j = 0; j < n2; j++)
            R.add(arr.get(mid + 1 + j));

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(L.get(i), R.get(j)) <= 0) {
                arr.set(k++, L.get(i++));
            } else {
                arr.set(k++, R.get(j++));
            }
        }

        while (i < n1) {
            arr.set(k++, L.get(i++));
        }

        while (j < n2) {
            arr.set(k++, R.get(j++));
        }
    }
}
