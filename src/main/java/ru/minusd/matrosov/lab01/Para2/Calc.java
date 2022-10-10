package lab01.Para2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calc {
    public static void translate(double num, int new_base) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int int_part = (int) (num);
        double frac_part = num - (int) num;
        ArrayList<Integer> new_int_part = new ArrayList<>();
        ArrayList<Integer> new_frac_part = new ArrayList<>();
        while (int_part != 0) {
            new_int_part.add(int_part % new_base);
            int_part /= new_base;
        }
        Collections.reverse(new_int_part);
        for (Integer i : new_int_part) {
            if (i >= 10) System.out.print(alph.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.print(",");
        for (int i = 0; i < 3; i++) {
            new_frac_part.add((int) (frac_part * new_base));
            frac_part = (frac_part * new_base) - (int) (frac_part * new_base);
        }
        //}
        for (Integer i : new_frac_part) {
            if (i >= 10) System.out.print(alph.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num = in.nextDouble();
        int new_base = in.nextInt();
        translate(num, new_base);
        translate(num, 2);
        translate(num, 16);
    }
}

