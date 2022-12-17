package lab01.Para2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size: ");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(0, 100));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size: " + list.size());
        System.out.println();
        System.out.print("To delete: ");
        int n = in.nextInt();
        int ind = list.indexOf(n);
        while (ind != -1) {
            list.remove(ind);
            ind = list.indexOf(n);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.print("Number for end-deleting: ");
        int num = in.nextInt();

        list.removeIf(elemList -> elemList % 10 == num);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size: " + list.size());

    }
}

