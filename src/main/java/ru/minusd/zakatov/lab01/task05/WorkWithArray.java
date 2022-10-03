package ru.minusd.zakatov.lab01.task05;

import java.util.Random;
import java.util.Scanner;

public class WorkWithArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Size: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt() & 100;
        }

        printArray(arr, size);

        // Removing number
        System.out.print("Remove number: ");
        int removeNum = in.nextInt();
        int countRemoves = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == removeNum) {
                countRemoves++;
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        size -= countRemoves;

        System.out.println("Size: " + size);
        printArray(arr, size);

        // Last digit
        System.out.print("Remove digit: ");
        int removeLastDigit = in.nextInt();
        countRemoves = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] % 10 == removeLastDigit) {
                countRemoves++;
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        size -= countRemoves;
        System.out.println("Size: " + size);
        printArray(arr, size);
    }

    public static void printArray(int[] arr, int size) {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
