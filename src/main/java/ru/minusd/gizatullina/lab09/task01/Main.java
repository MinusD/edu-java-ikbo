package ru.minusd.gizatullina.lab09.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[5];
        for(int i = 0; i < 5; i++){
            IDNumber[i] = new Student((int) (Math.random() * 500));
        }
        for(int i = 1; i < 5; i++)
            for(int j = i; j > 0 && IDNumber[j - 1].compareTo(IDNumber[j]) > 0; j--){
                Student tmp = IDNumber[j - 1];
                IDNumber[j - 1] = IDNumber[j];
                IDNumber[j] = tmp;
            }
        System.out.println(Arrays.toString(IDNumber));
    }
}
