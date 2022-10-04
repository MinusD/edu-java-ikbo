package pack5;

import java.util.Scanner;

public class Dog_kennel {
    private static Dog[] dogs = new Dog[100];
    public static void main(String[] args)
    {
        int d;
        Scanner s = new Scanner(System.in);
        System.out.print("Input count of dogs: ");
        d = s.nextInt();
        String name;
        int age;
        for(int i = 0; i<d; i++)
        {
            Dog dog = new Dog();
            System.out.print("Input name of " + (i+1) +" dog: ");
            name = s.next();
            System.out.print("Input age of "+ (i+1) + " dog: ");
            age = s.nextInt();
            dog.setName(name);
            dog.setAge(age);
            dogs[i] = dog;
        }
        for(int i = 0;i<d; i++)
            System.out.println(dogs[i].toString());
    }

}
