package ru.minusd.bulgakova.lab03.task06;


import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input radius 1 circle: ");
        Circle cir1 = new Circle(1, console.nextInt());
        System.out.print("Input radius 2 circle: ");
        Circle cir2 = new Circle(2, console.nextInt());
        cir1.comparison(cir2);
    }
}

