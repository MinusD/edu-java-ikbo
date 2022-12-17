package ru.minusd.budkov.lab05.task02;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT) {
        g.setColor(this.color);
        g.fillRect((int) (this.relative_x * WINDOW_WIDTH), (int) (this.relative_y * WINDOW_HEIGHT), (int) (Math.random() * WINDOW_WIDTH) / 2, (int) (Math.random() * WINDOW_HEIGHT) / 2);
    }
}
