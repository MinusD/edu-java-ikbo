package ru.minusd.vasiliev.lab30.classes.items;

public class MenuItem {
    private final int cost;
    private final String name;
    private final String description;

    public MenuItem(int cost, String name, String description) {
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
        return name + " (" + cost + " руб.)";
    }
}
