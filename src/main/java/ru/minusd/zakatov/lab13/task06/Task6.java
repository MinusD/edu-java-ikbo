package ru.minusd.zakatov.lab13.task06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputFile = in.nextLine();
        List<String> words = new ArrayList<>();

        try (Scanner file = new Scanner(new File(inputFile))) {
            while (file.hasNextLine()) {
                String str = file.nextLine();
                words.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        getLine(words);
    }

    public static String getLine(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).charAt(words.get(i).length() - 1) == words.get(j).charAt(0)) {
                    String tmp = words.get(j);
                    for (int k = j; k > i + 1; k--)
                        words.set(k, words.get(k - 1));
                    words.set(i + 1, tmp);
                }
                if (words.get(i).charAt(0) == words.get(j).charAt(words.get(j).length() - 1)) {
                    String tmp = words.get(j);
                    for (int k = j; k > i; k--)
                        words.set(k, words.get(k - 1));
                    words.set(i, tmp);
                }
            }
        }
        for (int i = 0; i <= words.size() - 1; i++) {
            System.out.println(words.get(i));
        }

        return "";
    }
}
