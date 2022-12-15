package ru.minusd.budkov.lab05.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Football implements ActionListener {
    private int madrid = 0, milan = 0;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JLabel winnerLabel;

    public JPanel getPanel() {
        JPanel panel = new JPanel();

        ACMilanButton = new JButton("AC Milan");
        ACMilanButton.addActionListener(this);
        panel.add(ACMilanButton);

        realMadridButton = new JButton("Real Madrid");
        realMadridButton.addActionListener(this);
        panel.add(realMadridButton);

        resultLabel = new JLabel();
        scoreLabel = new JLabel();
        winnerLabel = new JLabel();
        panel.add(resultLabel);
        panel.add(scoreLabel);
        panel.add(winnerLabel);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ACMilanButton){
            milan++;
            update("AC Milan");
        }
        else{
            madrid++;
            update("Real Madrid");
        }
    }

    private void update(String team){
        scoreLabel.setText("Last Score: " + team);
        resultLabel.setText("Result: " + milan + " X " + madrid);
        String w = "DRAW";
        if(milan > madrid)
            w = "AC Milan";
        else if (madrid > milan)
            w = "Real Madrid";
        winnerLabel.setText("Winner: " + w);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Football");
        frame.setSize(new Dimension(250, 250));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Football football = new Football();
        JPanel footballPanel = football.getPanel();

        Container content = frame.getContentPane();
        content.add(footballPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
