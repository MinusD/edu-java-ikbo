package pack2;

import java.util.Scanner;

public class TestBall {
    public static void  main(String[] args)
    {
        double x,y;
        Scanner s = new Scanner(System.in);
        System.out.print("Set x: ");
        x = s.nextDouble();
        System.out.print("Set y: ");
        y = s.nextDouble();
        Ball b = new Ball(x,y);
        int choice;
        while (true) {
            System.out.println("What you wanna to do: ");
            System.out.println("1) Get x ");
            System.out.println("2) Get y ");
            System.out.println("3) Set x ");
            System.out.println("4) Set y ");
            System.out.println("5) Set x and y ");
            System.out.println("6) Move ");
            choice = s.nextInt();
            if (choice == 1)
                System.out.println(b.getX());
            if (choice == 2)
                System.out.println(b.getY());
            if (choice == 3) {
                System.out.print("Set X: ");
                x = s.nextDouble();
                b.setX(x);
            }
            if (choice == 4)
            {
                System.out.print("Set X: ");
                y = s.nextDouble();
                b.setY(y);
            }
            if (choice == 5)
            {
                System.out.print("Set X and Y: ");
                x = s.nextDouble();
                y = s.nextDouble();
                b.setXY(x,y);
            }
            if (choice == 6)
            {
                System.out.print("Set xDisp and yDisp: ");
                x = s.nextDouble();
                y = s.nextDouble();
                b.move(x,y);
            }
        }
    }
}
