import java.util.Random;
import java.util.Scanner;

public class rand_massive {
    public static void sort(double[] arr,int size)
    {
        double min = 10000;
        int ind = 0;
        double [] temp = new double[size];
        for(int j = 0; j<size; j++)
        {
            for(int i = 0; i<size; i++)
            {
                if (arr[i] < min)
                {
                    min = arr[i];
                    ind = i;
                }
            }
            temp[j] = min;
            arr[ind] = 10000;
            min = 10000;
        }
        for(int i = 0; i<size; i++)
            arr[i] = temp[i];
    }
    public static void output(double[] arr, int size )
    {
        System.out.print("Array: ");
        for(int i = 0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Input size of array: ");
        size = s.nextInt();
        double[] arr = new double[size];
        System.out.println("Choose way of random: ");
        System.out.println("1) Math.random");
        System.out.println("2) Random");
        int choose;
        choose = s.nextInt();
        if (choose == 1)
        {
            for(int i = 0; i<size; i++)
                arr[i] = Math.random();
        }
        if (choose == 2)
        {
            Random r = new Random();
            for(int i = 0; i<size; i++)
                arr[i] = r.nextDouble(100);
        }
        output(arr,size);
        sort(arr,size);
        System.out.println();
        System.out.print("Sorted ");
        output(arr,size);
    }
}
