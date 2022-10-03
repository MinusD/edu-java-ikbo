package ru.minusd.denisov.lab01.task02;

public class HarmonicSeries {
    public static void main(String[] args) {
        float sum = 0;
        for (int i = 1; i <= 10; i++) {
            float f = 1f / i;
            System.out.format("%.2f\n", f);
            sum += f;
        }
        System.out.print("Sum: ");
        System.out.format("%.2f", sum);
    }
}
