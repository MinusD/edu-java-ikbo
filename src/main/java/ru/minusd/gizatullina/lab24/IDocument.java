package ru.minusd.gizatullina.lab24;

public abstract class IDocument {
    protected abstract void DoOpen();
    protected abstract void DoNew();
    protected abstract void DoSave();
    protected abstract void DoPrint();
}