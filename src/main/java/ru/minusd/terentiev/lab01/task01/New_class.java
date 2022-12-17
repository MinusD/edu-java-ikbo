import java.util.ArrayList;
import java.util.Scanner;

public class New_class {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Input size: ");
        n = scan.nextInt();
        int element;
        ArrayList <Integer> arr = new ArrayList<>(n);
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            System.out.print("Input " + i + " element: ");
            element = scan.nextInt();
            arr.add(element);
            sum +=element;
        }
        System.out.println("Massive: " + arr);
        System.out.print("Sum: " + sum);

    }
}
