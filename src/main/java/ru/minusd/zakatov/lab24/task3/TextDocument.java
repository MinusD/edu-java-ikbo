package ru.minusd.zakatov.lab24.task3;

public class TextDocument implements IDocument {
    private String text;
    private String name;
    private String font;

    public TextDocument(String text, String font) {
        this.text = text;
        this.font = font;
    }

    public String getFont() {
        return font;
    }

    @Override
    public String getContent() {
        return String.format("Text of %s.txt: %s, Font: %s", name, text, font);
    }

    @Override
    public IDocument copy() {
        return new TextDocument(text, font);
    }

    @Override
    public int getSize() {
        return text.length();
    }

    @Override
    public void open(String name) {
        this.name = name;
    }

    @Override
    public int save() {
        return 1;
    }
}
