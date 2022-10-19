package ru.minusd.vasiliev.lab05.match;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MatchGUI {
    private static int madridScore = 0;
    private static int milanScore = 0;

    public static void main(String[] args) {
        var frame = new JFrame("Soccer Match GUI");
        var panel = new JPanel();
        var milanButton = new JButton("AC Milan");
        var madridButton = new JButton("Real Madrid");
        var scoreLabel = new JLabel("Result: 0 x 0", JLabel.CENTER);
        var lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        var winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);
        for (Component comp : new Component[] {milanButton, madridButton, scoreLabel, lastScorerLabel, winnerLabel}) {
            panel.add(comp);
        }

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                UpdateScore(scoreLabel);
                UpdateWinner(winnerLabel);
                lastScorerLabel.setText("Last Scorer: AC Milan");
                frame.pack();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                UpdateScore(scoreLabel);
                UpdateWinner(winnerLabel);
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                frame.pack();
            }
        });

        frame.setSize(720, 360);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void UpdateScore(JLabel scoreLabel) {
        scoreLabel.setText(String.format("Result: %d x %d", milanScore, madridScore));
    }

    private static void UpdateWinner(JLabel winnerLabel) {
        winnerLabel.setText(String.format("Winner: %s",
                milanScore > madridScore ? "AC Milan"
                        : milanScore < madridScore ? "Real Madrid"
                        : "DRAW"));
    }
}
