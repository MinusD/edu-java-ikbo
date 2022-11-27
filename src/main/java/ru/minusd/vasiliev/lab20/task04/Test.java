package ru.minusd.vasiliev.lab20.task04;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("Минимальное значение: " + minMax.min());
        System.out.println("Максимальное значение: " + minMax.max());

        System.out.println(Calculator.div(1, 2));
        System.out.println(Calculator.mul(400, 3.5));
        System.out.println(Calculator.sub(1.5, 1.5));
        System.out.println(Calculator.sum(22, 2.22));
    }
}
