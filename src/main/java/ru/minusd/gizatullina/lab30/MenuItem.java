package ru.minusd.gizatullina.lab30;

import java.io.Serializable;

public class MenuItem implements Serializable {
    private String name;
    private String description;
    private int price;
    public MenuItem(String name, String description, int price) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            if (description == null || description.isEmpty()) {
                throw new IllegalArgumentException("Description cannot be empty");
            }
            if (price <= 0) {
                throw new IllegalArgumentException("Price cannot be less than or equal to zero");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
}