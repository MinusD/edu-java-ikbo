package ru.minusd.vasiliev.lab24.task3.documents;

public class ImageDocument implements IDocument {
    private String documentName;
    private Object documentData;

    public ImageDocument(String documentName, Object documentData) {
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
