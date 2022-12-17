package ru.minusd.bulgakova.lab03.task03;
import java.util.Scanner;

public class Tester {
    public int cntCircle;
    public Circle[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Tester test = new Tester();
        System.out.print("Input count circle: ");
        test.cntCircle = console.nextInt();
        test.array=new Circle[test.cntCircle];
        System.out.print("Input x: ");
        double x = console.nextDouble();
        System.out.print("Input y: ");
        double y = console.nextDouble();
        test.array[0]=new Circle(x,y);
        for (int i = 1; i < test.cntCircle; i++)
            test.array[i]=new Circle();

        for (int i = 0; i < test.cntCircle; i++)
            System.out.println(i+" circle ("+test.array[i].point.x+", "+test.array[i].point.y+")");
    }
}

