package ru.minusd.zakatov.lab05.task04;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageAnimation extends JFrame implements ActionListener {
    private final int DELAY = 120;

    private Timer timer;
    private int spriteNumber;

    List<Image> sprites = new ArrayList<>();

    public ImageAnimation() throws HeadlessException, IOException {
        timer = new Timer(DELAY, this);
        timer.start();

        for (int i = 0; i < 6; i++) {
            String src = ""; // you need put your images here
            src += (i + 1) + ".png";

            sprites.add(ImageIO.read(new File(src)));
        }

        setSize(new Dimension(150, 150));
        setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new ImageAnimation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        spriteNumber++;

        if (spriteNumber == 5) {
            spriteNumber = 0;
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(sprites.get(spriteNumber), 50, 50, null);
    }
}
