package ru.minusd.vasiliev.lab13.task06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSequencer {
    public static void main(String[] args) throws FileNotFoundException {
        var file = new File(args[0]);
        var scanner = new Scanner(file);
        var builder = new StringBuilder();
        while (scanner.hasNext()) {
            var word = scanner.next();
            if (builder.length() == 0 ||
                    builder.toString().toLowerCase().charAt(builder.length() - 2) == word.toLowerCase().charAt(0)) {
                builder.append(word).append(" ");
            } else if (builder.toString().toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                builder.insert(0, " ").insert(0, word);
            }
        }
        System.out.println(builder);
    }
}
