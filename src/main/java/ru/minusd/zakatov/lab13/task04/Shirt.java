package ru.minusd.zakatov.lab13.task04;

public class Shirt {
    private String model;
    private String name;
    private String color;
    private String size;

    public Shirt(String description) {
        String[] fields = description.split(",");
        model = fields[0];
        name = fields[1];
        color = fields[2];
        size = fields[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
