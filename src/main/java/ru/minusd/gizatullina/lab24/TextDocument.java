package ru.minusd.gizatullina.lab24;

public class TextDocument extends IDocument {
    protected void DoOpen() {
        System.out.println("TextDocument::DoOpen()");
    }
    protected void DoNew() {
        System.out.println("TextDocument::DoNew()");
    }
    protected void DoSave() {
        System.out.println("TextDocument::DoSave()");
    }
    protected void DoPrint() {
        System.out.println("TextDocument::DoPrint()");
    }
}