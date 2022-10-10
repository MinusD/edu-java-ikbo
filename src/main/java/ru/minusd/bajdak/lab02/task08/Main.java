package ru.minusd.bajdak.lab02.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++)
            data.add(scanner.next());
        Collections.reverse(data);
        data.forEach(s -> System.out.print(s + " "));
    }
}
