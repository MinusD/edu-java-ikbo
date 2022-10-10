package ru.minusd.poplavskij.lab02.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("¬ведите строку: ");
        String s = scanner.nextLine();
        char[] str = s.toCharArray();
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (str[i] == ' ' && str[i - 1] != ' ') {
                count++;
            }
        }
        if (str[s.length()-1] != ' ') count++;
        System.out.print(count);
    }
}
