package ru.minusd.zakatov.lab22.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CalculatorModel {
    private String expression = "";
    private double result = 0;
    private Map<String, Integer> operations = Map.of(
            "+", 1,
            "-", 1,
            "*", 2,
            "/", 2
    );

    public void calculate() {
        List<String> str = convertToPostfix(expression);
        Stack<Double> stack = new Stack<>();

        for (String s : str) {
            if (operations.containsKey(s)) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(switch (s) {
                    case "-" -> b - a;
                    case "*" -> a * b;
                    case "/" -> b / a;
                    default -> a + b;
                });
            } else {
                stack.push(Double.valueOf(s));
            }
        }

        result = stack.peek();
        expression = String.valueOf(result);
    }

    private List<String> convertToPostfix(String expression) {
        System.out.println("Convert: " + expression);
        List<String> postfix = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (String s : expression.split(" ")) {
            if (operations.containsKey(s)) {
                if (!stack.isEmpty() && operations.get(stack.peek()) >= operations.get(s)) {
                    while (!stack.isEmpty() && operations.get(stack.peek()) >= operations.get(s)) {
                        postfix.add(stack.pop());
                    }
                }
                stack.push(s);
            } else {
                postfix.add(s);
            }
        }

        while (!stack.isEmpty()) {
            postfix.add(stack.pop());
        }

        System.out.print("Postfix: ");
        for (var i : postfix)
            System.out.print(i + " ");
        System.out.println();

        return postfix;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double getResult() {
        return result;
    }
}
