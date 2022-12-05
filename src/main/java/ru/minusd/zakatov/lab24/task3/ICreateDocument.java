package ru.minusd.zakatov.lab24.task3;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(String name);
}
