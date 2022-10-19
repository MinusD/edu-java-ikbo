package ru.minusd.vasiliev.lab05.shapegen;

import java.awt.*;

public class Rectangle extends TaskShape {
    public Rectangle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(Graphics g, int width, int height) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
