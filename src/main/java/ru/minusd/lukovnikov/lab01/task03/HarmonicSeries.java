package ru.minusd.lukovnikov.lab01.task03;

public class HarmonicSeries {
    public static void main(String[] args) {
        double under_num = 1., sum = 0., tmp;
        for (int i = 0; i < 10; i++) {
            tmp = 1. / under_num;
            sum += tmp;
            System.out.printf("%.2f\n", tmp);
            under_num++;
        }
        System.out.printf("\n\n%.2f", sum);
    }
}