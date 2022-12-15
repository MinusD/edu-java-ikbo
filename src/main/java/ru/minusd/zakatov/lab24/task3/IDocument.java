package ru.minusd.zakatov.lab24.task3;

public interface IDocument {
    String getContent();
    IDocument copy();
    int getSize();
    void open(String name);
    int save();
}
