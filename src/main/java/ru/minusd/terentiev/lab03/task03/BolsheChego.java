import java.util.Random;
import java.util.Scanner;

public class BolsheChego {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n;
        System.out.print("Input size: ");
        n = s.nextInt();
        while (n < 10)
        {
            System.out.print("Wrong value, try again: ");
            n = s.nextInt();
        }
        int[] arr = new int[n];
        int x;
        for(int i = 0; i<n; i++)
        {
            x = r.nextInt(n);
            arr[i] = x;
        }
        System.out.print("Array: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
        int[] arr2 = new int[n];
        int count = 0;
        for(int i = 0; i<n; i++)
            if (arr[i]%2 == 0)
            {
                arr2[count] = arr[i];
                count++;
            }
        System.out.println();
        if (count!=0)
        {
            System.out.println("Array of even numbers: ");
            for(int i = 0; i <= count; i++)
                System.out.print(arr2[i] + " ");
        }
        else System.out.println("No even numbers");
    }
}
