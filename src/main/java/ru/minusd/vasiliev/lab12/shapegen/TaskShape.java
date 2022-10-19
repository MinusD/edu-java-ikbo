package ru.minusd.vasiliev.lab12.shapegen;

import java.awt.*;

public abstract class TaskShape {
    protected final int x, y;
    protected final Color color;

    public TaskShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g, int width, int height);
}
