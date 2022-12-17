package ru.minusd.vasiliev.lab24.task3.createDocument;

import ru.minusd.vasiliev.lab24.task3.documents.IDocument;

import java.io.FileNotFoundException;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(String path) throws FileNotFoundException;
}
