package ru.minusd.zakatov.lab16.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame implements ActionListener {
    private int randomNumber;
    private int attempt = 3;
    private JTextField textField;
    private JButton btn;
    private JLabel resultLabel;
    private JLabel attemptLabel;

    public GuessNumber() {
        super("Guess the number");
        randomNumber = (int) (Math.random() * 100) % 21;

        // Text Field Panel
        JPanel textFieldPane = new JPanel();
        textFieldPane.setLayout(new BoxLayout(textFieldPane, BoxLayout.Y_AXIS));
        textFieldPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));
        textField.setFont(new Font("Verdana", Font.PLAIN, 16));
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textFieldPane.add(textField);

        // Button panel
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.Y_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        btn = new JButton("Guess");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.addActionListener(this);

        resultLabel = new JLabel();
        resultLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resultLabel.setText("Отгадайте число");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        attemptLabel = new JLabel();
        attemptLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        attemptLabel.setText("Количество попыток: " + attempt);
        attemptLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPane.add(btn);
        buttonPane.add(resultLabel);
        buttonPane.add(attemptLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(textFieldPane, BorderLayout.CENTER);
        add(buttonPane, BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new GuessNumber();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (attempt <= 0) return;

        attempt--;
        if (attempt <= 0) {
            resultLabel.setText("Количество попыток закончилось");
            attemptLabel.setText("Количество попыток: " + attempt);
            return;
        }

        int input = textField.getText().isEmpty() ? 0 : Integer.parseInt(textField.getText());

        if (input < randomNumber) {
            resultLabel.setText("Загаданное число больше");
        } else if (input > randomNumber) {
            resultLabel.setText("Загаданное число меньше");
        } else {
            resultLabel.setText("Вы угадали!");
        }

        attemptLabel.setText("Количество попыток: " + attempt);
    }
}

