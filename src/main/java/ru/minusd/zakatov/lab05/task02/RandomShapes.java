package ru.minusd.zakatov.lab05.task02;

import javax.swing.*;
import java.awt.*;

public class RandomShapes extends JFrame {
    private final int width = 500;
    private final int height = 500;

    public RandomShapes() throws HeadlessException {
        setSize(new Dimension(width, height));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        RandomShapes shapesTask = new RandomShapes();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int nShapes = 20;

        for (int i = 0; i < nShapes; i++) {
            Color color = getRandomColor();
            g.setColor(color);

            int shapeType = getRandomNumber(0, 2);

            if (shapeType == 0) {
                int radius = getRandomNumber(5, 100);
                g.drawOval(
                        getRandomNumber(radius, width - radius),
                        getRandomNumber(radius, height - radius),
                        radius,
                        radius
                );
            } else if (shapeType == 1) {
                int rectWidth = getRandomNumber(10, 100);
                int rectHeight = getRandomNumber(10, 100);
                g.drawRect(
                        getRandomNumber(0, width - rectWidth),
                        getRandomNumber(0, height - rectHeight),
                        rectWidth,
                        rectHeight
                );
            }
        }
    }

    private Color getRandomColor() {
        int red = getRandomNumber(0, 256);
        int green = getRandomNumber(0, 256);
        int blue = getRandomNumber(0, 256);

        return new Color(red, green, blue);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
