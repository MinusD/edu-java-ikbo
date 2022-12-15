package ru.minusd.budkov.lab05.task04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

class Animation extends JFrame {
    int WINDOW_WIDTH = 720;
    int WINDOW_HEIGHT = 1280;
    String background_image_path;
    String animation_images_path = "D:/джава/5/src/task4/pictures/";

    Animation() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        Button btn = new Button("Start animation");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        btn.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        setTitle("Animation");
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                    }
                }
        );
        add(btn);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        animate(this.animation_images_path, g);
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}