package ru.minusd.bulgakova.lab01.task03;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:" );
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=(int)(Math.random() * 100);
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" " );
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if (arr[j]<arr[i]){
                    int value = arr[j];
                    arr[j]=arr[i];
                    arr[i]=value;
                }
            }
        }
        System.out.println();
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" " );
        }

        Random random = new Random();


        System.out.println("\nInput size of array:" );
        size = in.nextInt();
        int[] arra = new int[size];

        for(int i=0; i<size; i++){
            arra[i] = random.nextInt(100);
        }

        for(int i=0; i<size; i++){
            System.out.print(arra[i]+" " );
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if (arra[j]<arra[i]){
                    int value = arra[j];
                    arra[j]=arra[i];
                    arra[i]=value;
                }
            }
        }
        System.out.println();
        for(int i=0; i<size; i++){
            System.out.print(arra[i]+" " );
        }


    }
}

