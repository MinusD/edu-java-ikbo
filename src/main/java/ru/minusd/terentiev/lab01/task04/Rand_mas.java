import java.util.random.RandomGenerator;
//random next int, math.random
public class Rand_mas {
    public static void sort(int[]arr, int n)
    {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    };
    public static void main(String[] args)
    {
        int[]arr = new int[10];
        double n =0;
        for(int i = 0; i<10;i++)
        {
            n = Math.random()*10;
            arr[i] = (int)n ;
        }
        System.out.print("Massive: ");
        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ "; ");
        }
        sort(arr,10);
        System.out.println();
        System.out.print("Sort massive: ");
        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ "; ");
        }
    }
}
