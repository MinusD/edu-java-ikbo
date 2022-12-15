package ru.minusd.zakatov.lab15.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.BinaryOperator;

public class SimpleCalculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton addBtn = new JButton("Add");
    JButton subtractBtn = new JButton("Subtract");
    JButton mulBtn = new JButton("Mul");
    JButton divideBtn = new JButton("Divide");

    public SimpleCalculator() {
        super("Simple Calculator");
        setLayout(new FlowLayout());
        setSize(400, 200);
        add(new JLabel("1st number"));
        add(jta1);

        add(new JLabel("2nd number"));
        add(jta2);

        add(addBtn);
        add(subtractBtn);
        add(mulBtn);
        add(divideBtn);

        addBtn.addActionListener(new MyListener(Double::sum));
        subtractBtn.addActionListener(new MyListener((x1, x2) -> x1 - x2));
        mulBtn.addActionListener(new MyListener((x1, x2) -> x1 * x2));
        divideBtn.addActionListener(new MyListener((x1, x2) -> x1 / x2));

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

    private class MyListener implements ActionListener {
        private BinaryOperator<Double> operator;

        public MyListener(BinaryOperator<Double> operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(
                        null,
                        "Result = " + (operator.apply(x1, x2)),
                        "alert",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(
                        null,
                        "Error",
                        "alert",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
