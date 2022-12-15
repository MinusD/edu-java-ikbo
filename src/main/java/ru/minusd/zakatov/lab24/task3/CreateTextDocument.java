package ru.minusd.zakatov.lab24.task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("New text", "Times New Roman");
    }

    @Override
    public IDocument createOpen(String name) {
        IDocument document = new TextDocument("Opened text", "Courier");
        document.open(name);
        return document;
    }
}
