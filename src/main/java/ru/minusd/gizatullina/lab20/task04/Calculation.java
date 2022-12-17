package ru.minusd.gizatullina.lab20.task04;

public class Calculation {
    public static <N extends Number> double sum(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <N extends Number> double mul(N a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <N extends Number> double div(N a, N b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <N extends Number> double sub(N a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2.6));
        System.out.println(mul(2.7, 2));
        System.out.println(div(2, 2.0));
        System.out.println(sub(2.5, 2));
    }
}
