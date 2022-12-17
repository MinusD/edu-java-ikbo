package ru.minusd.zakatov.lab20.task03;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String speak;

    public Animal(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
