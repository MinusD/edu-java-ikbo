package pack8;

import java.util.Scanner;


public class Reverse {
    public static void output(String[] arr,int size)
    {
        for(int i = 0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        String temp;
        System.out.print("Input size: ");
        size = s.nextInt();
        String[] arr = new String[size];
        System.out.print("Input massive: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.next();
        }
        output(arr,size);
        System.out.println();
        if (size % 2 == 1)
            for (int i = 0; i < size; i++) {
                if (i == size-i-1)
                    break;
                temp = arr[i];
                arr[i] = arr[size-i-1];
                arr[size-i-1] = temp;
    }
        else if (size%2==0) {
            for(int i = 0; i<size;i++)
            {
                temp = arr[i];
                arr[i] = arr[size-i-1];
                arr[size-i-1] = temp;
                if (i+1 == size-i-1)
                    break;
            }
        }
        output(arr,size);
    }
}
