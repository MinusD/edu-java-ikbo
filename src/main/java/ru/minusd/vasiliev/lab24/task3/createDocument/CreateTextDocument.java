package ru.minusd.vasiliev.lab24.task3.createDocument;

import ru.minusd.vasiliev.lab24.task3.documents.IDocument;
import ru.minusd.vasiliev.lab24.task3.documents.TextDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("Новый текстовый файл", "");
    }

    @Override
    public IDocument createOpen(String path) throws FileNotFoundException {
        var file = new File(path);
        var scanner = new Scanner(file);
        var sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return new TextDocument(file.getName(), sb.toString());
    }
}
