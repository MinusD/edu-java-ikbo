package pack2;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    private static int size;
    private static Circle[] circles;
    public static void MinCircle() {
        double min = 100;
        int ind = 0;
        for(int i = 0; i<size; i++) {
            if (circles[i].getR() < min)
            {
                min = circles[i].getR();
                ind = i;
            }
        }
        System.out.print("Min circle: ");
        System.out.printf("Coords of point: %.3f", circles[ind].getPoint().getX());
        System.out.printf("; %.3f", circles[ind].getPoint().getY());
        System.out.print("; ");
        System.out.printf("Radius: %.3f", circles[ind].getR());
        System.out.println();
    }

    ;

    public static void MaxCircle() {
        double max = 0;
        int ind = 0;
        for(int i = 0; i<size; i++) {
            if (circles[i].getR() > max)
            {
                max = circles[i].getR();
                ind = i;
            }
        }
        System.out.print("Max circle: ");
        System.out.printf("Coords of point: %.3f", circles[ind].getPoint().getX());
        System.out.printf("; %.3f", circles[ind].getPoint().getY());
        System.out.print("; ");
        System.out.printf("Radius: %.3f", circles[ind].getR());
        System.out.println();
    }

    ;

    public static void sort()
    {
        double min = 10000;
        int ind = 0;
        Circle[] temp = new Circle[size];
        for(int j = 0; j<size; j++)
        {
            Circle b = new Circle();
            for(int i = 0; i<size; i++)
            {
                if (circles[i].getR() < min)
                {
                    min = circles[i].getR();
                    ind = i;
                }
            }
            b.setR(min);
            b.setPoint(circles[ind].getPoint().getX(),circles[ind].getPoint().getY());
            temp[j] = b;
            circles[ind].setR(10000);
            min = 10000;
        }
        circles = temp.clone();
    };
    public static void output()
    {
        for(int i = 0; i<size; i++)
        {
            System.out.printf("Coords of point: %.3f", circles[i].getPoint().getX());
            System.out.printf("; %.3f", circles[i].getPoint().getY());
            System.out.println();
            System.out.printf("Radius: %.3f", circles[i].getR());
            System.out.println();
        }
    };
    public static void main(String[] args) {
        System.out.print("Input size: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        circles = new Circle[size];
        double x,y,R;
        Random r = new Random();
        int i = 0;
        while (i<size)
        {
            Circle c = new Circle();
            x = r.nextDouble(10);
            y = r.nextDouble(10);
            R = r.nextDouble(50);
            c.setPoint(x,y);
            c.setR(R);
            circles[i] = c;
            i++;
        }
        output();
        System.out.println();
        MinCircle();
        MaxCircle();
        System.out.println();
        System.out.println("Sorted: ");
        sort();
        output();
    }
}
