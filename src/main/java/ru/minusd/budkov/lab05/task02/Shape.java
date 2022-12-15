package ru.minusd.budkov.lab05.task02;

import java.awt.*;

public abstract class Shape {
    Color color;
    double relative_x;
    double relative_y;

    abstract void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT);

    Shape() {
        color = new Color((int) (Math.random() * 0x1000000));
        relative_x = Math.random();
        relative_y = Math.random();
    }
}
