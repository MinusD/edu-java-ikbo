package pack;

import java.io.IOException;
import java.util.Scanner;

public class AuthorTester {
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.next();
        System.out.print("Email: ");
        String email = s.next();
        char gender;
        System.out.print("Gender: ");
        gender = (char)System.in.read();
        int choice;
        Author a = new Author(name,email,gender);
        while (true) {
            System.out.println("What you wanna to do: ");
            System.out.println("1) Get name: ");
            System.out.println("2) Get email: ");
            System.out.println("3) Set email: ");
            System.out.println("4) Get gender: ");
            choice = s.nextInt();
            if (choice == 1)
                System.out.println(a.getName());
            if (choice == 2)
                System.out.println(a.getEmail());
            if (choice == 3) {
                System.out.print("Set email: ");
                email = s.next();
                a.setEmail(email);
            }
            if (choice == 4)
                System.out.println(a.getGender());
        }
    }
}
