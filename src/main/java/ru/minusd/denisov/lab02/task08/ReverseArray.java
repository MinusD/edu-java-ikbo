package ru.minusd.denisov.lab02.task08;

public class ReverseArray {
    public static void main(String[] args) {
        String[] words = {"Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        int n = words.length;

        for (int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
