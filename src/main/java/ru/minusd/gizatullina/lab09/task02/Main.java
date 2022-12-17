package ru.minusd.gizatullina.lab09.task02;

import java.util.Arrays;

public class Main {
    public static int separation(Student[] arr, int a, int b) {
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student midl = arr[(a + b) / 2];
        int i = a;
        int j = b;
        while (i <= j) {
            while(comp.compare(arr[i], midl) > 0)
                i++;
            while(comp.compare(arr[j], midl) < 0)
                j--;
            if (i >= j)
                break;
            Student tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return j;
    }

    public static void quicksort(Student[] arr, int a, int b) {
        if (a < b){
            int q = separation(arr, a, b);
            quicksort(arr, a, q);
            quicksort(arr, q + 1, b);
        }
    }

    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for(int i = 0; i < 10; i++)
            IDNumber[i] = new Student((int) (Math.random() * 500), (int)(Math.random() * 10));
        quicksort(IDNumber, 0, 9);
        System.out.println(Arrays.toString(IDNumber));
    }
}