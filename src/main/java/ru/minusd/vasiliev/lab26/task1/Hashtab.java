package ru.minusd.vasiliev.lab26.task1;

public class Hashtab {
    private final int size = 100;
    private final String[] hashtab = new String[size];

    public void add(String s) {
        int index = hash(s);
        if (hashtab[index] == null)
            hashtab[index] = s;
        else {
            while (hashtab[index] != null)
                index = (index + 1) % size;
            hashtab[index] = s;
        }
    }

    public boolean find(String s) {
        int index = hash(s);
        if (hashtab[index] == null)
            return false;
        else {
            while (hashtab[index] != null) {
                if (hashtab[index].equals(s))
                    return true;
                index = (index + 1) % size;
            }
            return false;
        }
    }

    public void delete(String s) {
        int index = hash(s);
        if (hashtab[index] == null)
            return;
        else {
            while (hashtab[index] != null) {
                if (hashtab[index].equals(s)) {
                    hashtab[index] = null;
                    return;
                }
                index = (index + 1) % size;
            }
        }
    }

    private int hash(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++)
            hash += s.charAt(i);
        return hash % size;
    }
}