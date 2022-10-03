package ru.minusd.gizatullina.lab03.task06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestCircle {
    public static int cntCircle;
    public static List<Circle> arr;

    public static void Compare(Circle circle1,Circle circle2){
        if (circle1.Square()>circle2.Square()) {
            System.out.println("Circle 1 is larger than circle 2");
        }
        else if (circle1.Square()<circle2.Square()){
            System.out.println("Circle 2 is larger than circle 1");
        }
        else {
            System.out.println("Circles are equal in area");
        }
    }

    public static void main(String[] args) {

        arr = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.print("Input count circle: ");
        cntCircle = console.nextInt();

        double x, y, r;
        for (int i = 0; i < cntCircle; i++) {

            System.out.print("Input x: ");
            x = console.nextDouble();
            System.out.print("Input y: ");
            y = console.nextDouble();
            System.out.print("Input radius: ");
            r = console.nextDouble();

            // Add circle
            arr.add(new Circle(new Point(x,  y), r));
        }

        for (var circ : arr)
            System.out.println(circ.toString());

        System.out.println("Working out 6 tasks:");

        var circle1=new Circle(new Point(3,5),6);
        var circle2=new Circle(new Point(7,1),4);
        var circle3=new Circle(new Point(1,0),8);
        var circle4=new Circle(new Point(2,9),4);

        System.out.println(circle1.Length());
        System.out.println(circle2.Square());
        Compare(circle3,circle4);
        Compare(circle2,circle4);
    }
}