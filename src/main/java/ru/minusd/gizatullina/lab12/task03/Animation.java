package ru.minusd.gizatullina.lab12.task03;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Animation extends JFrame {
    private JLabel x;
    private int c = 1;

    private Animation() {
        this.setSize(2000, 2000);
        x = new JLabel("", new ImageIcon(getClass().getResource("1.png")), SwingConstants.CENTER);
        getContentPane().add(x);
        Timer timer = new Timer(200, w -> nextImg());
        timer.start();
    }

    private void nextImg() {
        x.setIcon(new ImageIcon(getClass().getResource((++c) + ".png")));
        if (c == 4) c = 0;
    }

    public static void main(String[] args) {
        Animation a = new Animation();
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
}
