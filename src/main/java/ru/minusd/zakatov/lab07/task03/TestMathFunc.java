package ru.minusd.zakatov.lab07.task03;

import java.util.Scanner;

public class TestMathFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathCalculable mc = new MathFunc();
        System.out.print("Enter radius: ");
        int r = in.nextInt();
        System.out.println(MathCalculable.PI * mc.pow(r, 2));
    }
}
