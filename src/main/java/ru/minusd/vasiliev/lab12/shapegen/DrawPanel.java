package ru.minusd.vasiliev.lab12.shapegen;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        var rand = new Random();
        for (int i = 0; i < 20; i++) {
            if (rand.nextInt(2) == 1) {
                new Circle(
                        rand.nextInt(720),
                        rand.nextInt(360),
                        new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))
                ).draw(g2d, rand.nextInt(360), rand.nextInt(360));;
            } else {
                new Rectangle(
                        rand.nextInt(720),
                        rand.nextInt(360),
                        new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))
                ).draw(g2d, rand.nextInt(360), rand.nextInt(360));
            }
        }
    }
}
