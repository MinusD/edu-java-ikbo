package ru.minusd.vasiliev.lab09;

import java.util.Arrays;

public class MergeSort {
    public Student[] merge(Student[] arr1, Student[] arr2) {
        var result = new Student[arr1.length + arr2.length];
        var firstIndex = 0;
        var secondIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (firstIndex < arr1.length) {
                if (secondIndex < arr2.length) {
                    if (arr1[firstIndex].getAverage() > arr2[secondIndex].getAverage()) {
                        result[i] = arr2[secondIndex++];
                        continue;
                    }
                }
                result[i] = arr1[firstIndex++];
            } else {
                result[i] = arr2[secondIndex++];
            }
        }
        return result;
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
                    if (arr[startIndex].getAverage() > arr[midIndex].getAverage()) {
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
}
