package ru.minusd.vasiliev.lab23.task3;

import ru.minusd.vasiliev.lab23.task3.operations.Add;
import ru.minusd.vasiliev.lab23.task3.operations.Multiply;
import ru.minusd.vasiliev.lab23.task3.operations.Subtract;
import ru.minusd.vasiliev.lab23.task3.values.Const;
import ru.minusd.vasiliev.lab23.task3.values.Variable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Subtract(
                new Multiply(
                        new Const(2), new Variable("x")
                ),
                new Const(3)
        ).evaluate(5));
        var scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        var x = scanner.nextDouble();
        System.out.println(new Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"), new Variable("x")
                            ),
                            new Multiply(
                                    new Const(2), new Variable("x")
                            )
                    ),
                    new Const(1)
                ).evaluate(x)
        );
    }
}
