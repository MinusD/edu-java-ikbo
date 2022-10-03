package ru.minusd.gizatullina.lab03.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Swapp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        System.out.print("Enter number of words: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.next());
        }
        Collections.reverse(arr);
        System.out.println("Rearranged words: ");
        arr.forEach(s -> System.out.print(s + " "));
    }
}
