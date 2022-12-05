package ru.minusd.zakatov.lab15.task04;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator extends JFrame {
    private JLabel label = new JLabel();
    private String x1 = "";
    private String x2 = "";
    private String operation = "";

    private List<JButton> digitButtons = new ArrayList<>();
    private Map<String, JButton> operationButtons = new HashMap<>();
    private JButton dotButton = new JButton(".");
    private JButton equalButton = new JButton("=");

    private Map<String, BinaryOperator<Double>> operations = new HashMap<>();

    public Calculator() {
        super("Calculator");
        setSize(500, 250);

        label.setFont(new Font("Verdana", Font.PLAIN, 24));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(400, 50));
        label.setText(x1);
        label.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(label, BorderLayout.NORTH);

        JPanel buttonsGrid = new JPanel();
        buttonsGrid.setLayout(new GridLayout(4, 4, 10, 10));
        buttonsGrid.setBorder(new EmptyBorder(10, 10, 10, 10));

        initOperations();
        initButtons();

        buttonsGrid.add(digitButtons.get(7));
        buttonsGrid.add(digitButtons.get(8));
        buttonsGrid.add(digitButtons.get(9));
        buttonsGrid.add(operationButtons.get("/"));
        buttonsGrid.add(digitButtons.get(4));
        buttonsGrid.add(digitButtons.get(5));
        buttonsGrid.add(digitButtons.get(6));
        buttonsGrid.add(operationButtons.get("*"));
        buttonsGrid.add(digitButtons.get(1));
        buttonsGrid.add(digitButtons.get(2));
        buttonsGrid.add(digitButtons.get(3));
        buttonsGrid.add(operationButtons.get("-"));
        buttonsGrid.add(digitButtons.get(0));
        buttonsGrid.add(dotButton);
        buttonsGrid.add(equalButton);
        buttonsGrid.add(operationButtons.get("+"));

        add(buttonsGrid, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    private void initOperations() {
        operations.put("+", Double::sum);
        operations.put("-", (x1, x2) -> x1 - x2);
        operations.put("*", (x1, x2) -> x1 * x2);
        operations.put("/", (x1, x2) -> x1 / x2);
    }

    private void initButtons() {
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton("" + i);
            btn.addActionListener(getDigitActionListener(i));
            digitButtons.add(btn);
        }

        for (var operation : operations.entrySet()) {
            JButton btn = new JButton(operation.getKey());
            btn.addActionListener(getOperationActionListener(operation.getKey()));
            operationButtons.put(
                    operation.getKey(),
                    btn
            );
        }

        dotButton.addActionListener(e -> {
            if (operation.isEmpty() && !x1.contains(".")) {
                x1 += ".";
            } else if (!operation.isEmpty() && !x2.contains(".")) {
                x2 += ".";
            }

            drawLabel();
        });

        equalButton.addActionListener(e -> {
            calculate();
            drawLabel();
        });
    }

    private void calculate() {
        if (x2.isEmpty()) {
            if (operation.equals("/")) {
                x1 = "0";
            } else {
                x1 = String.valueOf(operations
                        .get(operation)
                        .apply(Double.parseDouble(x1), 0.0)
                );
            }
        } else {
            if (x2.equals("0")) {
                x1 = "0";
            } else {
                x1 = String.valueOf(operations
                        .get(operation)
                        .apply(Double.parseDouble(x1), Double.parseDouble(x2))
                );
            }
        }

        operation = "";
        x2 = "";
    }

    private ActionListener getOperationActionListener(String key) {
        return e -> {
            if (!x2.isEmpty()) {
                calculate();
            }
            operation = key;

            drawLabel();
        };
    }

    private ActionListener getDigitActionListener(int i) {
        return e -> {
            if (operation.isEmpty()) {
                x1 += i;
            } else {
                x2 += i;
            }

            drawLabel();
        };
    }

    private void drawLabel() {
        label.setText(x1 + " " + operation + " " + x2);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
