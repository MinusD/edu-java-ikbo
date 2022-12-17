package ru.minusd.vasiliev.lab31.classes.items;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

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

    public static MenuItem fromFile(Path path) {
        try {
            var state = Files.readString(path);
            return MenuItem.fromString(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static MenuItem fromString(String state) {
        if (state.contains("null")) {
            return null;
        }
        return new MenuItem(Integer.parseInt(state.split("cost=")[1].split(",")[0]),
                state.split("name='")[1].split("',")[0],
                state.split("description='")[1].split("'}")[0]);
    }

    public String getSerializedString() {
        return "MenuItem{"
                + "cost=" + cost
                + ", name='" + name + '\''
                + ", description='" + description + '\'' + '}';
    }

    @Override
    public String toString() {
        return name + " (" + cost + " руб.)";
    }
}
