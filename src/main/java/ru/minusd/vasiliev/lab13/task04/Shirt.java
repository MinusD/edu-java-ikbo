package ru.minusd.vasiliev.lab13.task04;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirt) {
        var shirtData = shirt.split(", ");
        code = shirtData[0];
        name = shirtData[1];
        color = shirtData[2];
        size = shirtData[3];
    }

    public String toString() {
        return "Код: " + code + "\nНаименование: " + name + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
