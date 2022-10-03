package ru.minusd.zakatov.lab05.task03;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CommandLinePicture extends JFrame {
    private final int width = 500;
    private final int height = 500;
    private final BufferedImage img;

    public CommandLinePicture(String imgSrc) throws HeadlessException, IOException {
        img = ImageIO.read(new File(imgSrc));

        setSize(new Dimension(img.getWidth(), img.getHeight()));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new CommandLinePicture(args[0]);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(img, 0, 0, null);
    }
}
