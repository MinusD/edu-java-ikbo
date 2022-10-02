package ru.minusd.denisov.lab05.task03;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawPicture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        if (args.length == 0) {
            System.out.println("Please specify image file path");
            return;
        }

        try {
            BufferedImage img = ImageIO.read(new File(args[0]));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            frame.setSize(label.getPreferredSize());
            frame.add(label);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
