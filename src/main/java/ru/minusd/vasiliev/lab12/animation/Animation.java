package ru.minusd.vasiliev.lab12.animation;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Animation {
    public static void main(String[] args) {
        var frame = new JFrame("Banana");
        var label = new JLabel();
        frame.add(label);
        frame.setSize(512, 512);
        frame.setVisible(true);
        while (true) {
            for (int i = 0; i < 8; i++) {
                var image = new ImageIcon(Animation.class.getResource(String.format("frame_%d_delay-0.1s.png", i)));
                label.setIcon(image);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
