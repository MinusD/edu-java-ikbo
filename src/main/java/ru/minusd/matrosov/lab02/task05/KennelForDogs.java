package lab02.task05;

import java.util.ArrayList;
import java.util.Scanner;

public class KennelForDogs {

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        System.out.println("Сколько собак? ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("Введите имя " + (i+1) + " собаки: ");
            String name = scanner.next();
            System.out.print("Введите возраст " + (i+1) + " собаки: ");
            int age = scanner.nextInt();
            dogs.add(new Dog(name, age));
            if (dogs.size() == i + 1) {
                System.out.println("Собака успешно добавлена!)");
            }
        }
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).toString());
        }
        System.out.println();
        System.out.println("Геттеры для первой собаки");
        System.out.println(dogs.get(0).getName());
        System.out.println(dogs.get(0).getAge());
    }

}
