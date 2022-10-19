package ru.minusd.vasiliev.lab05.shapegen;

import java.awt.*;

public class Circle extends TaskShape {
    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(Graphics g, int width, int height) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
