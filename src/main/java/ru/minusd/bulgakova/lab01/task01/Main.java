package ru.minusd.bulgakova.lab01.task01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:" );
        int size = in.nextInt();
        int[] myArray = new int[size];
        int cnt = 0;
        while(cnt < size){
            myArray[cnt]=in.nextInt();
            cnt++;
        }
        cnt=0;
        System.out.println("Array:" );
        do{
            System.out.print(myArray[cnt]+" ");
            cnt++;
        }while(cnt<size);
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += myArray[i];
        }
        System.out.println("\nSum:"+ sum );
    }
}
