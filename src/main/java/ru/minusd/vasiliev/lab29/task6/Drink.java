package ru.minusd.vasiliev.lab29.task6;

public class Drink implements Item {
    private String name;
    private String description;
    private int cost;

    public Drink(String name, String description, int cost) {
        if (cost < 0 || name.equals("") || description.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
