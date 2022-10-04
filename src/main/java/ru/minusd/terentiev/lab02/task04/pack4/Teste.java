package pack4;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args)
    {
        Shop obj = new Shop();
        String computer;
        Scanner s = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("What you wanna to do: ");
            System.out.println("1) Add computer; ");
            System.out.println("2) Delete computer; ");
            System.out.println("3) Search computer. ");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.print("Input computer name: ");
                computer = s.next();
                obj.add(computer);
            }
            if (choice == 2) {
                System.out.print("Input computer name: ");
                computer = s.next();
                obj.del(computer);
            }
            if (choice == 3) {
                System.out.print("Input computer name: ");
                computer = s.next();
                obj.search(computer);
            }
        }
    }
}
