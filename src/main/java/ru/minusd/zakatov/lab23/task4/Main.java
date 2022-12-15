package ru.minusd.zakatov.lab23.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x, y, z: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.print("Enter expression: ");
        in.nextLine();
        String expression = in.nextLine();
        Expression exp = ExpressionParser.parse(expression);

        System.out.println("Expression: " + exp);
        System.out.println("Result = " + exp.evaluate(x, y, z));
        System.out.println("========");
        System.out.println();

        exp = ExpressionParser.parse("1000000 * x * x * x * x * x / (x - 1)");

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.printf("x = %s, f = %s\n", i, exp.evaluate(i));
            } catch (ArithmeticException e) {
                System.out.printf("x = %s, %s\n", i, e.getMessage());
            }
        }
    }
}
