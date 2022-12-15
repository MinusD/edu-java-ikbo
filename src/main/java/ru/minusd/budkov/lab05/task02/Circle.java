package ru.minusd.budkov.lab05.task02;

import java.awt.*;

public class Circle extends Shape {
    @Override
    void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT) {

        int diameter = (int) (Math.random() / 2 * Math.min(WINDOW_HEIGHT, WINDOW_WIDTH));

        g.setColor(this.color);
        g.fillOval((int) (this.relative_x * WINDOW_WIDTH), (int) (this.relative_y * WINDOW_HEIGHT), diameter, diameter);
    }
}
