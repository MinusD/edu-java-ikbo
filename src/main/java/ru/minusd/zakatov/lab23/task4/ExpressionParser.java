package ru.minusd.zakatov.lab23.task4;

import java.util.Map;
import java.util.Stack;

public class ExpressionParser {
    private static Map<Character, Integer> operations = Map.ofEntries(
            Map.entry('-', 1),
            Map.entry('+', 1),
            Map.entry('*', 2),
            Map.entry('/', 2)
    );

    public static Expression parse(String str) {
        str = str.trim();
        Stack<Character> charStack = new Stack<>();
        Stack<Expression> expressionStack = new Stack<>();
        StringBuilder number = new StringBuilder();
        boolean isUnaryMinus = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                number.append(ch);
            } else if (!number.isEmpty()) {
                if (isUnaryMinus) {
                    expressionStack.add(new UnaryMinus(new Const(Integer.parseInt(number.toString()))));
                } else {
                    expressionStack.add(new Const(Integer.parseInt(number.toString())));
                }
                isUnaryMinus = false;
                number = new StringBuilder();
            }

            if (Character.isLetter(ch)) {
                if (isUnaryMinus)
                    expressionStack.add(new UnaryMinus(new Variable(Character.toString(ch))));
                else
                    expressionStack.add(new Variable(Character.toString(ch)));
                isUnaryMinus = false;
            }

            if (ch == '(') {
                charStack.push(ch);
                continue;
            }

            if (ch == ')') {
                while (charStack.peek() != '(') {
                    expressionStack.push(extractOperation(charStack, expressionStack));
                }

                charStack.pop();
                continue;
            }

            if (ch == '-') {
                if (i == 0) {
                    isUnaryMinus = true;
                    continue;
                }

                for (int j = i - 1; j >= 0; j--) {
                    char jCh = str.charAt(j);

                    if (operations.containsKey(jCh) || jCh == '(') {
                        isUnaryMinus = true;
                        break;
                    } else if (Character.isDigit(jCh) || Character.isLetter(jCh) || jCh == ')') {
                        isUnaryMinus = false;
                        break;
                    }
                }

                if (isUnaryMinus) continue;
            }

            if (operations.containsKey(ch) && (charStack.isEmpty() || charStack.peek() == '(')) {
                charStack.push(ch);
            } else if (operations.containsKey(ch) && operations.get(ch) > operations.get(charStack.peek())) {
                charStack.push(ch);
            } else if (operations.containsKey(ch)) {
                while (!charStack.isEmpty() && operations.get(ch) <= operations.get(charStack.peek())) {
                    expressionStack.push(extractOperation(charStack, expressionStack));
                }

                charStack.push(ch);
            }
        }

        if (!number.isEmpty()) {
            if (isUnaryMinus) {
                expressionStack.add(new UnaryMinus(new Const(Integer.parseInt(number.toString()))));
            } else {
                expressionStack.add(new Const(Integer.parseInt(number.toString())));
            }
        }

        while (!charStack.isEmpty()) {
            expressionStack.push(extractOperation(charStack, expressionStack));
        }

        return expressionStack.peek();
    }

    private static Expression extractOperation(Stack<Character> c, Stack<Expression> n) {
        char top = c.pop();
        Expression a = n.pop();
        Expression b = n.pop();
        return switch (top) {
            case '-' -> new Subtract(b, a);
            case '*' -> new Multiply(b, a);
            case '/' -> new Divide(b, a);
            default -> new Add(b, a);
        };
    }
}
