package ru.minusd.zakatov.lab07.task05;

import ru.minusd.zakatov.lab07.task04.ProcessStringInterface;

public class ProcessStrings implements ProcessStringInterface {
    private String str;

    public ProcessStrings(String str) {
        this.str = str;
    }

    @Override
    public int count() {
        return str.length();
    }

    @Override
    public String getOddString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    @Override
    public String reverse() {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public String getStr() {
        return str;
    }
}
