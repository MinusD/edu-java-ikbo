package ru.minusd.bajdak.lab05.task01;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static JFrame frame = getFrame();

    static JPanel panel = new JPanel();

    public static void main(String[] args) {
        panel.setLayout(new GridLayout(0, 2, 10, 10));

        AtomicInteger milanScore = new AtomicInteger();
        AtomicInteger madridScore = new AtomicInteger();

        JButton milanButton = new JButton("AC Milan");
        panel.add(milanButton);
        milanButton.addActionListener(e -> {
            milanScore.getAndIncrement();
            updateScore(panel, milanScore.get(), madridScore.get(), "AC Milan");
        });

        JButton madridButton = new JButton("Real Madrid");
        panel.add(madridButton);
        madridButton.addActionListener(e -> {
            madridScore.getAndIncrement();
            updateScore(panel, milanScore.get(), madridScore.get(), "Real Madrid");
        });


        JLabel resultLabel = new JLabel("Result: 0 X 0");
        panel.add(resultLabel);

        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
        panel.add(lastScorerLabel);

        Label winnerLabel = new Label("Winner: DRAW");
        panel.add(winnerLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }

    public static void updateScore(JPanel panel, int milanScore, int madridScore, String lastScorer) {
        JLabel resultLabel = (JLabel) panel.getComponent(2);
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        JLabel lastScorerLabel = (JLabel) panel.getComponent(3);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        Label winnerLabel = (Label) panel.getComponent(4);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
    static JFrame getFrame(){
        JFrame frame = new JFrame("Match results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dimension.width/2-200, dimension.height/2-100,400,200);
        return frame;
    }
}
