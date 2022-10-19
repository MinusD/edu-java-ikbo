package ru.minusd.vasiliev.lab07.task56;

public class ProcessStrings implements StringManip {
    private final String str;

    public ProcessStrings(String str) {
        this.str = str;
    }

    public int count() {
        return str.length();
    }

    public String oddString() {
        var builder = new StringBuilder();
        for (int i = 1; i < count(); i += 2) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public String revert() {
        var builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }
}
