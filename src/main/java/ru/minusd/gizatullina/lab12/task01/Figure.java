package ru.minusd.gizatullina.lab12.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Figure extends JFrame{
    public Figure()  {
        setSize(1000, 1000);
        JFrame frame = new JFrame("random figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Paint figures");
        button.setPreferredSize(new Dimension(300, 160));
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(255,255,255));
        graph.fillRect(0, 0, 1000, 1000);
        for (int i = 0; i < 20; i++) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            int[] arrayx = {(int) (Math.random() * 100) + 37 * i, (int) (Math.random() * 25) + 39 * i, (int) (Math.random() * 70) + 49 * i, (int) (Math.random() * 80) + 47 * i,(int) (Math.random() * 100) + 37 * i,(int) (Math.random() * 100) + 37 * i,(int) (Math.random() * 100) + 37 * i,};
            int[] arrayy = {(int) (Math.random() * 10) + 45 * i, (int) (Math.random() * 100) + 46 * i, (int) (Math.random() * 100) + 35 * i, (int) (Math.random() * 50) + 46 * i,(int) (Math.random() * 100) + 37 * i,(int) (Math.random() * 100) + 37 * i,(int) (Math.random() * 100) + 37 * i,};
            Polygon poly = new Polygon(arrayx, arrayy, 7);
            graph.drawPolygon(poly);
            graph.fillPolygon(poly);
        }
    }
    public static void main(String args[]) {
        Figure a = new Figure();
    }
}