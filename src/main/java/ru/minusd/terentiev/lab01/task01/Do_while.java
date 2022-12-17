import java.util.ArrayList;
import java.util.Scanner;

public class Do_while
    {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Input size: ");
        n = scan.nextInt();
        int element;
        ArrayList <Integer> arr = new ArrayList<>(n);
        int i = 1;
        int sum = 0;
        do
        {
            System.out.print("Input "+i+" element: ");
            element = scan.nextInt();
            arr.add(element);
            sum +=element;
            i++;
        }
        while (i<=n);
        System.out.println("Massive: " + arr);
        System.out.println("Sum: " + sum);
    }
}