package ru.minusd.vasiliev.lab12.imgopener;

import javax.swing.*;

public class ImageOpen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Opener");
        frame.setSize(720, 720);
        JPanel panel = new JPanel();
        var label = new JLabel(new ImageIcon(ImageOpen.class.getResource(args[0])));
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
