package ru.minusd.bajdak.lab02.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        var res = s.split(" ");
        System.out.println(res.length);
    }
}
