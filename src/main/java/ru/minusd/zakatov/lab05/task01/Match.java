package ru.minusd.zakatov.lab05.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Match {
    static int milanScore = 0;
    static int madridScore = 0;
    static String lastScorer = "";
    static String winner = "";

    static String milanStr = "AC Milan";
    static String madridStr = "Real Madrid";

    static JLabel resultLabel;
    static JLabel lastScorerLabel;
    static JLabel winnerLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Match");
        Container c = frame.getContentPane();

        c.setLayout(new BorderLayout());

        Box labelsBox = new Box(BoxLayout.Y_AXIS);
        c.add(labelsBox, BorderLayout.SOUTH);

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        labelsBox.add(resultLabel);
        labelsBox.add(lastScorerLabel);
        labelsBox.add(winnerLabel);

        Box buttonsBox = new Box(BoxLayout.X_AXIS);
        c.add(buttonsBox, BorderLayout.NORTH);

        JButton milanBtn = new JButton(milanStr);
        JButton madridBtn = new JButton(madridStr);

        milanBtn.addActionListener(Match::actionListener);
        madridBtn.addActionListener(Match::actionListener);

        buttonsBox.add(milanBtn);
        buttonsBox.add(madridBtn);

        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void actionListener(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals(milanStr)) {
            milanScore++;
            lastScorer = milanStr;
        } else if (actionEvent.getActionCommand().equals(madridStr)) {
            madridScore++;
            lastScorer = madridStr;
        }

        if (milanScore == madridScore) {
            winner = "DRAW";
        } else if (milanScore > madridScore) {
            winner = milanStr;
        } else {
            winner = madridStr;
        }

        resultLabel.setText(String.format("Result %d X %d", milanScore, madridScore));
        lastScorerLabel.setText(String.format("Last Scorer: %s", lastScorer));
        winnerLabel.setText(String.format("Winner: %s", winner));
    }
}
