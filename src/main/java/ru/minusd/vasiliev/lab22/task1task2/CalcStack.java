package ru.minusd.vasiliev.lab22.task1task2;

import java.util.Stack;

public class CalcStack {
    private Stack<Double> operandStack;

    public CalcStack() {
        operandStack = new Stack<>();
    }

    private int priority(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + c);
        };
    }

    private double calculate(double a, double b, char c) {
        return switch (c) {
            case '+' -> (a + b);
            case '-' -> (a - b);
            case '*' -> (a * b);
            case '/' -> (a / b);
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + c);
        };
    }

    public double calculate(String expression) {
        var exprMembers = expression.split(" ");
        for (String exprMember : exprMembers) {
            if (exprMember.equals("")) {
                continue;
            }
            if (exprMember.length() == 1 && "+-*/".contains(exprMember)) {
                if (operandStack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов");
                }
                var b = operandStack.pop();
                var a = operandStack.pop();
                operandStack.push(calculate(a, b, exprMember.charAt(0)));
            } else {
                operandStack.push(Double.parseDouble(exprMember));
            }
        }
        return operandStack.pop();
    }
}
