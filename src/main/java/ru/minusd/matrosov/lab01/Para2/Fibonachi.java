package lab01.Para2;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        int a = 0;
        int b = 1;
        int res;
        for (int i = 2; i < n; i++) {
            res = a + b;
            if (i > v) {
                System.out.print(res + " ");
            }
            a = b;
            b = res;
        }
    }
}
