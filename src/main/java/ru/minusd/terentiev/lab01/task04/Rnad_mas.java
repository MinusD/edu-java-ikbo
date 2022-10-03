import java.util.*;
//random next int, math.random
public class Rnad_mas {
    public static void main(String[] args)
    {
        Rand_mas s = new Rand_mas();
        Random random = new Random();
        int[]arr = new int[10];
        int n;
        for(int i = 0; i<10;i++)
        {
            n = random.nextInt();
            arr[i] = n ;
        }
        System.out.print("Massive: ");
        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ "; ");
        }
        s.sort(arr,10);
        System.out.println();
        System.out.print("Sort massive: ");
        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ "; ");
        }
    }
}
