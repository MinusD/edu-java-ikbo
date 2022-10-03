package ru.minusd.denisov.lab02.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        System.out.println(countWordsInLine(line));
    }

    public static int countWordsInLine(String line) {
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i)) && !isWord) {
                isWord = true;
                count++;
            } else if (!Character.isLetter(line.charAt(i))) {
                isWord = false;
            }
        }
        return count;
    }
}
