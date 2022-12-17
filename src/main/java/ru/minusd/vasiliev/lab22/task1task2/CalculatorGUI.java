package ru.minusd.vasiliev.lab22.task1task2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CalculatorGUI extends JFrame {
    private final List<JButton> numButtons = new ArrayList<JButton>();
    private final List<JButton> opButtons = Arrays.asList(
            new JButton("+"),
            new JButton("-"),
            new JButton("*"),
            new JButton("/"),
            new JButton("."),
            new JButton("Пробел")
    );
    private final CalcStack calc = new CalcStack();

    private final JTextField textField = new JTextField();
    private final JButton buttonClear = new JButton("C");
    private final JButton buttonEqual = new JButton("=");

    private StringBuilder exprBuilder = new StringBuilder();

    public CalculatorGUI() {
        super("Калькулятор");
        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        var panel = new JPanel(new GridLayout(6, 3));
        for (int i = 0; i < 10; i++) {
            numButtons.add(new JButton(String.valueOf(i)));
            panel.add(numButtons.get(i));
        }
        for (JButton button : numButtons) {
            button.addActionListener((e) -> {
                exprBuilder.append(button.getText());
                textField.setText(exprBuilder.toString());
            });
            panel.add(button);
        }
        for (JButton button : opButtons) {
            button.addActionListener((e) -> {
                if (exprBuilder.length() == 0) return;
                if ("+-*/".contains(String.valueOf(exprBuilder.charAt(exprBuilder.length() - 1)))) {
                    exprBuilder.deleteCharAt(exprBuilder.length() - 1);
                }
                if (!".".equals(button.getText())) {
                    exprBuilder.append(' ');
                }
                if (!"Пробел".equals(button.getText())) {
                    exprBuilder.append(button.getText());
                }
                textField.setText(exprBuilder.toString());
            });
            panel.add(button);
        }
        panel.add(buttonClear);
        panel.add(buttonEqual);
        buttonClear.addActionListener((e) -> {
            exprBuilder = new StringBuilder();
            textField.setText(exprBuilder.toString());
        });
        buttonEqual.addActionListener((e) -> {
            try {
                textField.setText(String.valueOf(calc.calculate(exprBuilder.toString())));
                exprBuilder = new StringBuilder(textField.getText());
            } catch (IllegalArgumentException ex) {
                textField.setText("Ошибка: " + ex.getMessage());
                exprBuilder = new StringBuilder();
            }
        });
        add(panel, BorderLayout.CENTER);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setVisible(true);
    }
}
