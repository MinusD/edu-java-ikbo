package pack3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Set massive size: ");
        size = s.nextInt();
        double x,y;
        Circle[] arr = new Circle[size];
        for (int i = 0; i < size; i++)
        {
            Circle c = new Circle();
            System.out.print("Input point coords for " + (i+1) + " object: ");
            x = s.nextDouble();
            y = s.nextDouble();
            c.setPoint(x,y);
            arr[i] = c;
        }
        for(int i = 0;i<size;i++)
        {
            arr[i].getPoint();
        }
    }
}
