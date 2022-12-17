import java.util.Random;

public class progressive {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random r  = new Random();
        int x;
        for(int i = 0; i<4; i++)
        {
            x = r.nextInt(10,100);
            arr[i] = x;
        }
        System.out.print("Array: ");
        for(int i = 0; i<4; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if (arr[3] > arr[2] && arr[2] > arr[1] && arr[1] > arr[0])
            System.out.println("Array grows");
        else System.out.println("Array not grows");
    }
}
