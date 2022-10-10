package lab01.Para1;

import java.util.Scanner;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите длину массива");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("1 - for, 2 - while, 3 - do while");
        int num = in.nextInt();
        switch (num) {
            case 1:
                int sum1 = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                for (int i = 0; i < arr.length; i++) {

                    sum1 += arr[i];
                }
                System.out.println(sum1);
                break;

            case 2:
                int k = 0;
                int sum2 = 0;
                while (k < len) {
                    arr[k] = in.nextInt();
                    k++;
                }
                int l = 0;
                while (l < len) {
                    sum2 += arr[l];
                    l++;
                }
                System.out.println(sum2);
                break;
            case 3:
                int c = 0;
                int b = 0;
                int sum3 = 0;
                do {
                    arr[c] = in.nextInt();
                    c++;
                } while (c < len);
                do {
                    sum3 += arr[b];
                    b++;
                } while (b < len);
                System.out.println(sum3);
                break;
            default:
                System.out.println("¬веди нормальное число");
        }


    }
}











