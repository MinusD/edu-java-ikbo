package ru.minusd.gizatullina.lab07.task04;

public class Main {
    public static void main(String[] args) {
        MathCalculable a = new MathFunc();
        System.out.println("Complex number: 3 + 4i");
        System.out.println("Module of complex number: " + a.complexM(3, 4));
        System.out.println("Size of radius is: 10");
        System.out.println("Length of circle is: " + 2 * a.PI * 10);
    }
}
