package ru.minusd.isaeva.lab01.task05;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Del {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sizeOfArray = Integer.parseInt(in.nextLine());
        ArrayList <Integer> array = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++){
            array.add((int)(Math.random()*101));
        }
        System.out.println(array+" ");
        System.out.println("Введите число для удаления: ");
        int numberToDelete = Integer.parseInt(in.nextLine());
        while (array.remove(Integer.valueOf(numberToDelete)));
        System.out.println(array+" ");
        System.out.println("Длина массива: "+ array.size());
        System.out.println("Введите цифру для удаления: ");
        int digitToDelete = Integer.parseInt(in.nextLine());
        Iterator <Integer> iterator = array.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number%10 == digitToDelete)
                iterator.remove();
        }
        System.out.println(array+" ");
        System.out.println("Длина массива: "+ array.size());

    }
}
