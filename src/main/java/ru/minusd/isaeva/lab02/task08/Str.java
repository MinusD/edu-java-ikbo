package ru.minusd.isaeva.lab02.task08;
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String array[]=new String[count];
        in.nextLine();
        for (int i = 0; i < count ; i++){
            array[i]= in.nextLine();
        }
        for (int i = 0; i < count; i++){
            System.out.println(array[i]+" ");
        }
        for (int i = 0; i < count/2; i++){
            String temp=array[i];
            array[i]=array[count-1-i];
            array[count-1-i]=temp;
        }
        for (int i = 0; i < count; i++){
            System.out.println(array[i]+" ");
        }
    }
}
