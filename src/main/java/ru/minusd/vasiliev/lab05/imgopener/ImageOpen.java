package ru.minusd.vasiliev.lab05.imgopener;

import javax.swing.*;

public class ImageOpen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Opener");
        frame.setSize(720, 720);
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(args[0]);
        var label = new JLabel(image);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
