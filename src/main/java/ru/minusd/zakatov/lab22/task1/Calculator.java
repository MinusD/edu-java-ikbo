package ru.minusd.zakatov.lab22.task1;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter RPN-expression: ");
        String rpn = in.nextLine();
        System.out.println("Result: " + calculate(rpn));
    }

    public static double calculate(String rpn) {
        Stack<Double> stack = new Stack<>();
        String[] str = rpn.split(" ");

        for (String s : str) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                double a = stack.pop();
                double b = stack.pop();
                double result = switch(s) {
                    case "-" -> b - a;
                    case "*" -> a * b;
                    case "/" -> b / a;
                    default -> a + b;
                };
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(s));
            }
        }

        return stack.peek();
    }
}
