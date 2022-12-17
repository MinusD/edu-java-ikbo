package ru.minusd.gizatullina.lab09.task03;

import java.util.Arrays;
public class Main {
    public static void merge(Student[] arr, int a, int midl, int b){
        int i = 0;
        int j = 0;
        Student[] result = new Student[b - a];
        while(a + i < midl && midl + j < b){
            if(arr[a + i].compareTo(arr[midl + j]) < 0) {
                result[i + j] = arr[a + i];
                i++;
            }
            else{
                result[i + j] = arr[midl + j];
                j++;
            }
        }

        while (a + i < midl) {
            result[i + j] = arr[a + i];
            i++;
        }
        while (midl + j < b) {
            result[i + j] = arr[midl + j];
            j++;
        }
        System.arraycopy(result, 0, arr, a, i + j);
    }
    public static void mergeSort(Student[] arr, int a, int b){
        if (a + 1 >= b)
            return;
        int mid = (a + b) / 2;
        mergeSort(arr, a, mid);
        mergeSort(arr, mid, b);
        merge(arr, a, mid, b);
    }
    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for(int i = 0; i < 10; i++){
            IDNumber[i] = new Student((int) (Math.random() * 500));
        }
        mergeSort(IDNumber, 0, 10);
        System.out.println(Arrays.toString(IDNumber));
    }
}