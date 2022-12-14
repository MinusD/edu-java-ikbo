package ru.minusd.vasiliev.lab26.task1;

public class Hashtab {
    private final int size = 100;
    private final String[] hashtab = new String[size];

    public void add(String key, String value) {
        int index = hash(key);
        if (hashtab[index] == null)
            hashtab[index] = value;
        else {
            while (hashtab[index] != null)
                index = (index + 1) % size;
            hashtab[index] = key;
        }
    }

    public String find(String key) {
        int index = hash(key);
        return hashtab[index];
    }

    public void delete(String key) {
        int index = hash(key);
        hashtab[index] = null;
    }

    private int hash(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++)
            hash += s.charAt(i);
        return hash % size;
    }

    public String getMinimum() {
        for (int i = 0; i < size; i++)
            if (hashtab[i] != null)
                return hashtab[i];
        return null;
    }
}