import java.util.Scanner;

public class fibonachi {
    static public void main(String[] args)
    {
        int el = 1,size = 0;
        Scanner s = new Scanner(System.in);
        while (el>size)
        {
            System.out.print("Length: ");
            size = s.nextInt();
            System.out.print("Which element start: ");
            el = s.nextInt()-1;
            if (el>size)
                System.out.println("Incorrect input, try again");
        }
        int[] arr = new int[size];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<size;i++)
            arr[i] = arr[i-1]+arr[i-2];
        System.out.print("Numbers: ");
        for(int i = el; i<size; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
