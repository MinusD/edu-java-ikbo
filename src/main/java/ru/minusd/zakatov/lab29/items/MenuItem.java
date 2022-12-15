package ru.minusd.zakatov.lab29.items;

import java.io.Serializable;

public abstract class MenuItem implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int cost;
    private final String name;
    private final String description;

    public MenuItem(int cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
