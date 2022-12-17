package ru.minusd.vasiliev.lab24.task3.documents;

public class TextDocument implements IDocument {
    private String documentName;
    private String documentData;

    public TextDocument(String documentName, String documentData) {
        this.documentName = documentName;
        this.documentData = documentData;
    }

    @Override
    public String getDocumentName() {
        return documentName;
    }

    @Override
    public Object getDocumentData() {
        return documentData;
    }
}
