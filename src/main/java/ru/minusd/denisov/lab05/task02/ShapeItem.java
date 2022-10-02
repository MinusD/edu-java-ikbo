package ru.minusd.denisov.lab05.task02;

import java.awt.*;

public class ShapeItem {
    private Shape shape;
    private Color color;

    public ShapeItem(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
