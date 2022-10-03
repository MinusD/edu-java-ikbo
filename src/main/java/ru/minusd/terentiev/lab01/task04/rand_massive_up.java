import java.util.Arrays;
import java.util.Scanner;

public class rand_massive_up {
    static public void output(int[] arr, int size)
    {
        System.out.print("Massive: ");
        for(int i = 0; i<size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Size: " + size);
    }
    static public void main(String[] args) {
        double s;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input size: ");
        size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            s = Math.random() * 100;
            arr[i] = (int) s;
        }
        output(arr, size);
        int el;
        System.out.print("Which element you want delete: ");
        el = scan.nextInt();
        for(int i = 0; i<size; i++)
            if (arr[i] == el)
                arr[i] = -1;
        for(int i = 0; i<size; i++)
            if (arr[i] == -1)
                for(int j = i; j<size;j++)
                    if (arr[j]!=-1)
                    {
                        arr[i] = arr[j];
                        arr[j] = -1;
                        break;
                    }
        int k = 0;
        for(int i =0;i<size;i++)
        {
            if (arr[i] != -1)
                k++;
            else
                break;
        }
        arr = Arrays.copyOf(arr,k);
        size = k;
        output(arr,size);
        System.out.print("Which element with this last num you want delete: ");
        el = scan.nextInt();
        for(int i = 0; i<size;i++)
            if (arr[i]%10==el)
                arr[i] = -1;
        for(int i = 0; i<size; i++)
            if (arr[i] == -1)
                for(int j = i; j<size;j++)
                    if (arr[j]!=-1)
                    {
                        arr[i] = arr[j];
                        arr[j] = -1;
                        break;
                    }
        k = 0;
        for(int i =0;i<size;i++)
        {
            if (arr[i] != -1)
                k++;
            else
                break;
        }
        arr = Arrays.copyOf(arr,k);
        output(arr,k);
    }
}
