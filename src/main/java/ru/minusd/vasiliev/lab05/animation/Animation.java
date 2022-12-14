package ru.minusd.vasiliev.lab05.animation;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Animation {
    public static void main(String[] args) {
        var frame = new JFrame("Banana");
        var label = new JLabel();
        frame.add(label);
        frame.setSize(512, 512);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            for (int i = 0; i < 8; i++) {
                var image = new ImageIcon(String.format("D:\\code\\edu-java-ikbo\\src\\main\\java\\ru\\minusd\\vasiliev\\lab05\\animation\\frame_%d_delay-0.1s.png", i));
                label.setIcon(image);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
